// Generated by view binder compiler. Do not edit!
package com.bdd.notes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bdd.notes.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView EmailTxt;

  @NonNull
  public final TextView ForgotPass;

  @NonNull
  public final LinearLayout Register;

  @NonNull
  public final TextView RegisterQst;

  @NonNull
  public final ConstraintLayout Registerqst;

  @NonNull
  public final TextView ToRegister;

  @NonNull
  public final LinearLayout ToRegisterContainer;

  @NonNull
  public final EditText email;

  @NonNull
  public final TextView passtxt;

  @NonNull
  public final EditText password;

  @NonNull
  public final TextInputLayout passwordcontainer;

  @NonNull
  public final Button signin;

  @NonNull
  public final TextView textView;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView, @NonNull TextView EmailTxt,
      @NonNull TextView ForgotPass, @NonNull LinearLayout Register, @NonNull TextView RegisterQst,
      @NonNull ConstraintLayout Registerqst, @NonNull TextView ToRegister,
      @NonNull LinearLayout ToRegisterContainer, @NonNull EditText email, @NonNull TextView passtxt,
      @NonNull EditText password, @NonNull TextInputLayout passwordcontainer,
      @NonNull Button signin, @NonNull TextView textView) {
    this.rootView = rootView;
    this.EmailTxt = EmailTxt;
    this.ForgotPass = ForgotPass;
    this.Register = Register;
    this.RegisterQst = RegisterQst;
    this.Registerqst = Registerqst;
    this.ToRegister = ToRegister;
    this.ToRegisterContainer = ToRegisterContainer;
    this.email = email;
    this.passtxt = passtxt;
    this.password = password;
    this.passwordcontainer = passwordcontainer;
    this.signin = signin;
    this.textView = textView;
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
      id = R.id.EmailTxt;
      TextView EmailTxt = ViewBindings.findChildViewById(rootView, id);
      if (EmailTxt == null) {
        break missingId;
      }

      id = R.id.ForgotPass;
      TextView ForgotPass = ViewBindings.findChildViewById(rootView, id);
      if (ForgotPass == null) {
        break missingId;
      }

      id = R.id.Register;
      LinearLayout Register = ViewBindings.findChildViewById(rootView, id);
      if (Register == null) {
        break missingId;
      }

      id = R.id.RegisterQst;
      TextView RegisterQst = ViewBindings.findChildViewById(rootView, id);
      if (RegisterQst == null) {
        break missingId;
      }

      ConstraintLayout Registerqst = (ConstraintLayout) rootView;

      id = R.id.ToRegister;
      TextView ToRegister = ViewBindings.findChildViewById(rootView, id);
      if (ToRegister == null) {
        break missingId;
      }

      id = R.id.ToRegisterContainer;
      LinearLayout ToRegisterContainer = ViewBindings.findChildViewById(rootView, id);
      if (ToRegisterContainer == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.passtxt;
      TextView passtxt = ViewBindings.findChildViewById(rootView, id);
      if (passtxt == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.passwordcontainer;
      TextInputLayout passwordcontainer = ViewBindings.findChildViewById(rootView, id);
      if (passwordcontainer == null) {
        break missingId;
      }

      id = R.id.signin;
      Button signin = ViewBindings.findChildViewById(rootView, id);
      if (signin == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, EmailTxt, ForgotPass, Register,
          RegisterQst, Registerqst, ToRegister, ToRegisterContainer, email, passtxt, password,
          passwordcontainer, signin, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
