package com.muckja.muckjaproject;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    final static private String URL = "http://suneunil93.cafe24.com/LoginClass.php";
    private Map<String, String> parameters;
    public LoginRequest(String kakaoID, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("RegisterRequest", error.getMessage());
            }
        });
        parameters = new HashMap<>();
        parameters.put("kakaoID", kakaoID);
    }
    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}

