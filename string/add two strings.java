string addStrings(string num1, string num2) {
    int n1=num1.size()-1;
    int n2=num2.size()-1;
    string sb;
    int carry=0;
    while(n1>=0 || n2>=0){
        if(n1<0){
           sb.push_back((((num2[n2]-48)+carry)%10)+48);
           carry= ((num2[n2]-48)+carry)/10;
            n2--;
        }
        else if(n2<0){
            sb.push_back((((num1[n1]-48)+carry)%10)+48);
            carry= ((num1[n1]-48)+carry)/10;
            n1--;
        }
        else{
            sb.push_back(((((num1[n1]-48)+(num2[n2]-48))+carry)%10)+48);
            carry= (((num1[n1]-48)+(num2[n2]-48)+carry)/10);
            n1--;n2--;
        }
    }
    if(carry>0){
        sb.push_back(carry+48);
    }
    reverse(sb.begin(),sb.end());
    return sb;
