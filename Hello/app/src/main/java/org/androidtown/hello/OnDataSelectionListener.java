package org.androidtown.hello;

import android.view.View;
import android.widget.AdapterView;

/**
 * �������� ���õǾ��� �� ó���ϴ� ������ ���� ����
 */
public interface OnDataSelectionListener {

    /**
     * �������� ���õǾ��� �� ȣ��Ǵ� �޼ҵ�
     */
    public void onDataSelected(AdapterView parent, View v, int position, long id);

}
