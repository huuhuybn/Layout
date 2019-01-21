package vn.edu.poly.layout.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import vn.edu.poly.layout.R;
import vn.edu.poly.layout.model.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {


    public Context context;

    public List<User> users;

    public UserAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).
                inflate(R.layout.user_item, viewGroup, false);

        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder userHolder, int i) {
        userHolder.user = users.get(i);
        userHolder.tvName.setText(userHolder.user.USER_FULL_NAME);

        userHolder.btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {

        if (users == null) return 0;
        else
            return users.size();
    }


    class UserHolder extends RecyclerView.ViewHolder {

        public final TextView tvName;
        public final Button btnDel;
        public User user;

        public UserHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            btnDel = itemView.findViewById(R.id.btnDel);
        }
    }


}
