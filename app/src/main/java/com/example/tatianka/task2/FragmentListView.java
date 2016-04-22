package com.example.tatianka.task2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class FragmentListView extends Fragment {

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";

    private List<Content> mContent;
    int mPageNumber;

    static FragmentListView newInstance(int page) {
        FragmentListView fragmentListView = new FragmentListView();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        fragmentListView.setArguments(arguments);
        return fragmentListView;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_list, container, false);

        ListView listView = (ListView) view.findViewById(R.id.tabListView);

        ContentGenerator dataGenerator = new ContentGenerator(mPageNumber);
        mContent = dataGenerator.getContent();

        ListAdapter adapter = new ListViewAdapter(mContent, getContext());
        listView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }

}
