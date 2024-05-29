const anagrams=(n, string_list)=>{
          
    let map = {};
        
    for(let i=0;i<n;i++){
        let word = string_list[i];
        //console.log("word "+word);
        let letters = word.split('');
        //console.log("letters "+letters);
        letters.sort();
        let sortedWord = letters.join('');
        
        if(!map[sortedWord])
            map[sortedWord] = []
        map[sortedWord].push(word)
    
    }
    
    let result = []
    let allKeys = Object.keys(map);
    allKeys.sort()
    
    let keyLength = allKeys.length;
    let k = 0
    for(let i=0;i<keyLength;i++){
           result[k++]  = map[allKeys[i]]
    }
    
    console.log("result "+result)
    return result
}


anagrams(3,["no" ,"on" ,"is"])