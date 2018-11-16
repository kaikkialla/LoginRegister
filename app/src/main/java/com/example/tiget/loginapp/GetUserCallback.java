package com.example.tiget.loginapp;

interface GetUserCallback {

    /**
     * Invoked when background task is completed
     */

    public abstract void done(User returnedUser);
}
