package no.nordli.observeradapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.plugins.RxJavaPlugins;

public abstract class ObserverAdapter<T, VH extends ObservableViewHolder<T>> extends RecyclerView.Adapter<VH> {
    private List<T> dataSource = new ArrayList<>();
    private static final String tag = ObserverAdapter.class.getName();

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return viewHolder(parent, viewType);
    }

    public abstract VH viewHolder(@NonNull ViewGroup parent, int viewType);

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    public void crashMe() {
        Scheduler scheduler = RxJavaPlugins.createIoScheduler(new RxThreadFactory("crash_test"));
        Scheduler.Worker worker = scheduler.createWorker();
        worker.schedule(() -> {
            Log.i(tag, "CRASHME: This scheduled should not crash....yet");
        });
    }
}