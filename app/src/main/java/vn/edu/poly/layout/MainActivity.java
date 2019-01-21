package vn.edu.poly.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;
import java.util.Random;

import vn.edu.poly.layout.adapter.UserAdapter;
import vn.edu.poly.layout.model.User;

public class MainActivity extends AppCompatActivity {


    private RecyclerView lvList;
    private UserAdapter userAdapter;
    private LinearLayoutManager linearLayoutManager;

    private List<User> users;


    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(MainActivity.this);

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.USER_USER_NAME = "Huy " + i;
            user.USER_FULL_NAME = "Huy " + new Random().nextInt(100);
            user.USER_PHONE = new Random().nextInt(100000) + "";
            user.USER_PASSWORD = "123456";
            dbHelper.insertUser(user);
        }

        lvList = findViewById(R.id.lvList);

        users = dbHelper.getAllUsers();
        userAdapter = new UserAdapter(this, users);
        linearLayoutManager = new LinearLayoutManager(this);
        lvList.setLayoutManager(linearLayoutManager);
        lvList.setAdapter(userAdapter);


    }


}
