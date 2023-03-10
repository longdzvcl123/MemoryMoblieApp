package com.example.memorymoblieapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.memorymoblieapp.R;
import com.example.memorymoblieapp.adapter.ImageAdapter;
import com.example.memorymoblieapp.obj.Image;

import java.util.ArrayList;

public class ImageFragment2 extends Fragment {
    ArrayList<Image> ImageList;
    ImageAdapter adapter;
    private Context context;
    boolean detailed;

    public ImageFragment2(boolean detailed) {
        this.detailed = detailed;
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View imagesFragment;
        if(detailed)
            imagesFragment = inflater.inflate(R.layout.image_detail_fragment, container, false);
        else
            imagesFragment = inflater.inflate(R.layout.image_fragment, container, false);

        RecyclerView recycler = imagesFragment.findViewById(R.id.imageRecView);

        if (detailed) {
            // LayoutManager
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 1);
            gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
            recycler.setLayoutManager(gridLayoutManager);

            // Divider
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recycler.getContext(), gridLayoutManager.getOrientation());
            recycler.addItemDecoration(dividerItemDecoration);
        } else {
            // LayoutManager
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
            gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
            recycler.setLayoutManager(gridLayoutManager);
        }

        ImageList = new ArrayList<Image>();
        addImageList();
        adapter = new ImageAdapter(ImageList, context, detailed);
        recycler.setAdapter(adapter);

        return imagesFragment;
    }

    private void addImageList() {
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
        ImageList.add(new Image("Test.png", "9.27 KB", "20/1/2023", "512 x 512", "TP.HCM", R.drawable.image1));
    }
}