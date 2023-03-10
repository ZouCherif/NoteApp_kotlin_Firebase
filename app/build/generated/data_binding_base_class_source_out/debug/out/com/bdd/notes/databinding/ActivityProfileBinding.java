// Generated by view binder compiler. Do not edit!
package com.bdd.notes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView EmailTxt;

  @NonNull
  public final TextView Username;

  @NonNull
  public final AppCompatButton appCompatButton;

  @NonNull
  public final TextView textView9;

  private ActivityProfileBinding(@NonNull ConstraintLayout rootView, @NonNull TextView EmailTxt,
      @NonNull TextView Username, @NonNull AppCompatButton appCompatButton,
      @NonNull TextView textView9) {
    this.rootView = rootView;
    this.EmailTxt = EmailTxt;
    this.Username = Username;
    this.appCompatButton = appCompatButton;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.EmailTxt;
      TextView EmailTxt = ViewBindings.findChildViewById(rootView, id);
      if (EmailTxt == null) {
        break missingId;
      }

      id = R.id.Username;
      TextView Username = ViewBindings.findChildViewById(rootView, id);
      if (Username == null) {
        break missingId;
      }

      id = R.id.appCompatButton;
      AppCompatButton appCompatButton = ViewBindings.findChildViewById(rootView, id);
      if (appCompatButton == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      return new ActivityProfileBinding((ConstraintLayout) rootView, EmailTxt, Username,
          appCompatButton, textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
