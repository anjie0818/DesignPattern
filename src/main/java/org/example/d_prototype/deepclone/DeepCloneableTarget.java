package org.example.d_prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {

	/**
	 * ���л�����ʱ���ϵͳ��ǰ���serialVersionUIDд�뵽���л��ļ��У��������л�ʱϵͳ���Զ�����ļ��е�serialVersionUID��
	 * �ж����Ƿ��뵱ǰ���е�serialVersionUIDһ�¡����һ��˵�����л��ļ��İ汾�뵱ǰ��İ汾��һ���ģ����Է����л��ɹ��������ʧ��
	 */
	private static final long serialVersionUID = 1L;

	private String cloneName;

	private String cloneClass;

	//������
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	//��Ϊ��������ԣ�����String , �����������ʹ��Ĭ�ϵ�clone��ɼ���
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
