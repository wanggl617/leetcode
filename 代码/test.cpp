#include<bits/stdc++.h>
using namespace std;
    int minimumSwitchingTimes(vector<vector<int>>& source, vector<vector<int>>& target) {
        vector<int> buf_1;
        vector<int> buf_2;
        int ans =0 ;
        for(int i = 0; i < source.size(); ++i){
            for(int j = 0; j < source[0].size(); ++j){
                buf_1.push_back(source[i][j]);
                buf_2.push_back(target[i][j]);
            }
        }
        sort(buf_1.begin(),buf_1.end());
        sort(buf_2.begin(),buf_2.end());
        int i = 0,j =0;
        while(i < buf_1.size() && j < buf_2.size()){
            if(buf_1[i] == buf_2[j]){
                
                i++;
                j++;
                ans++;
                continue;
            }else if(buf_1[i] < buf_2[j]){
                //cout<<buf_1[i]<<" "<<buf_2[j]<<endl;
                i++;
                continue;
            }
            else{
                //cout<<buf_1[i]<<" "<<buf_2[j]<<endl;
                j++;
            }
        }
        return buf_1.size() -ans;
    }
int main(){
    
    // vector<vector<int>> source = {{1,3,2},{3,4,5}};
    // vector<vector<int>> target = {{1,2,3},{6,5,7}};
    //     cout<<"ans:"<<endl;
    //     int ans = minimumSwitchingTimes(source,target);
    //     cout<< ans<<endl;
    int x = 1 << 1;  
    cout<< "xxxx:"<<endl;
    cout<< x<<endl;
    return 0;
}
