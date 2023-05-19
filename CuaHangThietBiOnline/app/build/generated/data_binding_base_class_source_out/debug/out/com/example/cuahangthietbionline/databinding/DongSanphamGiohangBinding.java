// Generated by view binder compiler. Do not edit!
package com.example.cuahangthietbionline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cuahangthietbionline.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DongSanphamGiohangBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btngiam;

  @NonNull
  public final Button btngiatri;

  @NonNull
  public final Button btntang;

  @NonNull
  public final ImageView imgviewgiohang;

  @NonNull
  public final TextView textviewgiagiohang;

  @NonNull
  public final TextView textviewtengiohang;

  private DongSanphamGiohangBinding(@NonNull LinearLayout rootView, @NonNull Button btngiam,
      @NonNull Button btngiatri, @NonNull Button btntang, @NonNull ImageView imgviewgiohang,
      @NonNull TextView textviewgiagiohang, @NonNull TextView textviewtengiohang) {
    this.rootView = rootView;
    this.btngiam = btngiam;
    this.btngiatri = btngiatri;
    this.btntang = btntang;
    this.imgviewgiohang = imgviewgiohang;
    this.textviewgiagiohang = textviewgiagiohang;
    this.textviewtengiohang = textviewtengiohang;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DongSanphamGiohangBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DongSanphamGiohangBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dong_sanpham_giohang, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DongSanphamGiohangBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btngiam;
      Button btngiam = ViewBindings.findChildViewById(rootView, id);
      if (btngiam == null) {
        break missingId;
      }

      id = R.id.btngiatri;
      Button btngiatri = ViewBindings.findChildViewById(rootView, id);
      if (btngiatri == null) {
        break missingId;
      }

      id = R.id.btntang;
      Button btntang = ViewBindings.findChildViewById(rootView, id);
      if (btntang == null) {
        break missingId;
      }

      id = R.id.imgviewgiohang;
      ImageView imgviewgiohang = ViewBindings.findChildViewById(rootView, id);
      if (imgviewgiohang == null) {
        break missingId;
      }

      id = R.id.textviewgiagiohang;
      TextView textviewgiagiohang = ViewBindings.findChildViewById(rootView, id);
      if (textviewgiagiohang == null) {
        break missingId;
      }

      id = R.id.textviewtengiohang;
      TextView textviewtengiohang = ViewBindings.findChildViewById(rootView, id);
      if (textviewtengiohang == null) {
        break missingId;
      }

      return new DongSanphamGiohangBinding((LinearLayout) rootView, btngiam, btngiatri, btntang,
          imgviewgiohang, textviewgiagiohang, textviewtengiohang);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
