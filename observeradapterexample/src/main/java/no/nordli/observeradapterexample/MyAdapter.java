package no.nordli.observeradapterexample;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import no.nordli.observeradapter.ObservableViewHolder;
import no.nordli.observeradapter.ObserverAdapter;

public class MyAdapter extends ObserverAdapter<String, MyAdapter.ViewHolder> {

    @Override
    public ViewHolder viewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false));
    }

    public class ViewHolder extends ObservableViewHolder<String> {

        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void bindItem(String object) {

        }
    }
}
