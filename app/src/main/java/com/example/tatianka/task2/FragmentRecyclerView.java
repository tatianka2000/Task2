package com.example.tatianka.task2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class FragmentRecyclerView extends Fragment {

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number"; //[Comment] Wrong visibility modifier

    private List<Content> mContent;
    int mPageNumber; //[Comment] Wrong visibility modifier

    static FragmentRecyclerView newInstance(int page) {
        FragmentRecyclerView fragmentRelative = new FragmentRecyclerView();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        fragmentRelative.setArguments(arguments);
        return fragmentRelative;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_recycler, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tabRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        ContentGenerator dataGenerator = new ContentGenerator(mPageNumber);
        mContent = dataGenerator.getContent();

        RecyclerView.Adapter adapter = new RecyclerViewAdapter(mContent, getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }
}