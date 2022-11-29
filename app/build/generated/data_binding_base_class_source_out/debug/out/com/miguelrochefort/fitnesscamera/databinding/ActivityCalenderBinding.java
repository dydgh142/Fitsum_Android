// Generated by view binder compiler. Do not edit!
package com.miguelrochefort.fitnesscamera.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.miguelrochefort.fitnesscamera.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCalenderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button back;

  @NonNull
  public final CalendarView calendarView;

  @NonNull
  public final TextView calender;

  @NonNull
  public final Button chaBtn;

  @NonNull
  public final EditText contextEditText;

  @NonNull
  public final Button delBtn;

  @NonNull
  public final TextView diaryTextView;

  @NonNull
  public final TextView line;

  @NonNull
  public final Button saveBtn;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final ConstraintLayout title;

  private ActivityCalenderBinding(@NonNull ConstraintLayout rootView, @NonNull Button back,
      @NonNull CalendarView calendarView, @NonNull TextView calender, @NonNull Button chaBtn,
      @NonNull EditText contextEditText, @NonNull Button delBtn, @NonNull TextView diaryTextView,
      @NonNull TextView line, @NonNull Button saveBtn, @NonNull TextView textView2,
      @NonNull ConstraintLayout title) {
    this.rootView = rootView;
    this.back = back;
    this.calendarView = calendarView;
    this.calender = calender;
    this.chaBtn = chaBtn;
    this.contextEditText = contextEditText;
    this.delBtn = delBtn;
    this.diaryTextView = diaryTextView;
    this.line = line;
    this.saveBtn = saveBtn;
    this.textView2 = textView2;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCalenderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCalenderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_calender, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCalenderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      Button back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.calendarView;
      CalendarView calendarView = ViewBindings.findChildViewById(rootView, id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.calender;
      TextView calender = ViewBindings.findChildViewById(rootView, id);
      if (calender == null) {
        break missingId;
      }

      id = R.id.cha_Btn;
      Button chaBtn = ViewBindings.findChildViewById(rootView, id);
      if (chaBtn == null) {
        break missingId;
      }

      id = R.id.contextEditText;
      EditText contextEditText = ViewBindings.findChildViewById(rootView, id);
      if (contextEditText == null) {
        break missingId;
      }

      id = R.id.del_Btn;
      Button delBtn = ViewBindings.findChildViewById(rootView, id);
      if (delBtn == null) {
        break missingId;
      }

      id = R.id.diaryTextView;
      TextView diaryTextView = ViewBindings.findChildViewById(rootView, id);
      if (diaryTextView == null) {
        break missingId;
      }

      id = R.id.line;
      TextView line = ViewBindings.findChildViewById(rootView, id);
      if (line == null) {
        break missingId;
      }

      id = R.id.save_Btn;
      Button saveBtn = ViewBindings.findChildViewById(rootView, id);
      if (saveBtn == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.title;
      ConstraintLayout title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivityCalenderBinding((ConstraintLayout) rootView, back, calendarView, calender,
          chaBtn, contextEditText, delBtn, diaryTextView, line, saveBtn, textView2, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
