package cn.itcast.convert;

import org.apache.commons.beanutils.Converter;

/**
 * �Զ���ö��ת����
 * 
 * 
 */
public class MyEnumConverter implements Converter {

	@Override
	// ��value ת��Ϊ c���� --- ö��ͨ��ת����
	public Object convert(Class c, Object value) {
		String strVal = (String) value;
		// �ȼ��� Type.valueOf(strVal);
		return Enum.valueOf(c, strVal);
	}

}
