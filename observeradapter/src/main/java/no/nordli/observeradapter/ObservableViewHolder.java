package no.nordli.observeradapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class ObservableViewHolder<M> extends RecyclerView.ViewHolder {
    public ObservableViewHolder(View itemView) {
        super(itemView);
    }
    public abstract void bindItem(M object);
}