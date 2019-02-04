package xust;

/*
1. ��ů��
�����Ѿ����١� ������������һ���й̶����Ȱ뾶�Ĺ�ů�������з��ݹ�ů��

���ڣ�����λ��һ��ˮƽ���ϵķ��ݺ͹�ů����λ�ã��ҵ����Ը������з��ݵ���С���Ȱ뾶��

���ԣ�������뽫���Ƿ��ݺ͹�ů����λ�á��㽫�����ů������С���Ȱ뾶��

˵��:

�����ķ��ݺ͹�ů������Ŀ�ǷǸ����Ҳ��ᳬ�� 25000��
�����ķ��ݺ͹�ů����λ�þ��ǷǸ����Ҳ��ᳬ��10^9��
ֻҪ����λ�ڹ�ů���İ뾶��(�����ڱ�Ե��)�����Ϳ��Եõ���ů��
���й�ů������ѭ��İ뾶��׼�����ȵİ뾶Ҳһ����
ʾ�� 1:

����: [1,2,3],[2]
���: 1
����: ����λ��2����һ����ů����������ǽ����Ȱ뾶��Ϊ1����ô���з��ݾͶ��ܵõ���ů��
ʾ�� 2:

����: [1,2,3,4],[1,4]
���: 1
����: ��λ��1, 4����������ů����������Ҫ�����Ȱ뾶��Ϊ1���������з��ݾͶ��ܵõ���ů��
 */
public class Test_0204 {
	public static void main(String[] args) {
		Solution So = new Solution();
		int[] houses = {1,2,3,4};
		int[] heaters = {1,4};
		System.out.println(So.findRadius(houses, heaters));
	}
}
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int max = heaters[0]-houses[0];
        int j = 0;
        for(int i=0; i<houses.length; i++){
        	while(j<heaters.length && houses[i] < heaters[j]){
        		j++;
        	}
        	max = Math.max(max, heaters[i]-houses[j]);
        }
        return Math.max(max,houses[houses.length-1]-heaters[heaters.length-1]);
    }
}