// Generated by view binder compiler. Do not edit!
package com.bdd.notes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bdd.notes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ModifyNoteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText editTextTextEmailAddress3;

  @NonNull
  public final EditText editTextTextMultiLine;

  private ModifyNoteBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText editTextTextEmailAddress3, @NonNull EditText editTextTextMultiLine) {
    this.rootView = rootView;
    this.editTextTextEmailAddress3 = editTextTextEmailAddress3;
    this.editTextTextMultiLine = editTextTextMultiLine;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ModifyNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ModifyNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.modify_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ModifyNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editTextTextEmailAddress3;
      EditText editTextTextEmailAddress3 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextEmailAddress3 == null) {
        break missingId;
      }

      id = R.id.editTextTextMultiLine;
      EditText editTextTextMultiLine = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextMultiLine == null) {
        break missingId;
      }

      return new ModifyNoteBinding((ConstraintLayout) rootView, editTextTextEmailAddress3,
          editTextTextMultiLine);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}