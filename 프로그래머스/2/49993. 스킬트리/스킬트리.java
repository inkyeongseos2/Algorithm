class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        //※스킬은 중복해 주어지지 않음
        
        for(int i = 0; i < skill_trees.length; i++){
            String tree = skill_trees[i];
            System.out.println(i);
            for(int j = 0; j < skill_trees[i].length(); j++){
                //1.스킬에 포함된 문자인지 확인
                String ch = String.valueOf(skill_trees[i].charAt(j));
                if(!skill.contains(ch)){
                    //2.포함되지 않은 문자 제거
                    tree = tree.replace(ch,"");
                }
            }
            
            //3.스킬과 동일한지 확인
            if(skill.indexOf(tree) == 0){
                answer++;
            }
        }
        
        return answer;
    }
}