// Generated by view binder compiler. Do not edit!
package com.bdd.notes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bdd.notes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton Log;

  @NonNull
  public final AppCompatButton SignUp;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton Log,
      @NonNull AppCompatButton SignUp) {
    this.rootView = rootView;
    this.Log = Log;
    this.SignUp = SignUp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Log;
      AppCompatButton Log = ViewBindings.findChildViewById(rootView, id);
      if (Log == null) {
        break missingId;
      }

      id = R.id.SignUp;
      AppCompatButton SignUp = ViewBindings.findChildViewById(rootView, id);
      if (SignUp == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, Log, SignUp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}