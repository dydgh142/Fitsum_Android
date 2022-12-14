// Generated by view binder compiler. Do not edit!
package com.miguelrochefort.fitnesscamera.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.miguelrochefort.fitnesscamera.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMain3Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView afrag3Rv;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final ImageButton write;

  private FragmentMain3Binding(@NonNull LinearLayout rootView, @NonNull RecyclerView afrag3Rv,
      @NonNull ProgressBar progressBar, @NonNull NestedScrollView scrollView,
      @NonNull ImageButton write) {
    this.rootView = rootView;
    this.afrag3Rv = afrag3Rv;
    this.progressBar = progressBar;
    this.scrollView = scrollView;
    this.write = write;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMain3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMain3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMain3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.afrag3_rv;
      RecyclerView afrag3Rv = ViewBindings.findChildViewById(rootView, id);
      if (afrag3Rv == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.scroll_view;
      NestedScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.write;
      ImageButton write = ViewBindings.findChildViewById(rootView, id);
      if (write == null) {
        break missingId;
      }

      return new FragmentMain3Binding((LinearLayout) rootView, afrag3Rv, progressBar, scrollView,
          write);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
