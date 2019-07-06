import React from "react";
import Group from "./Group"

const GroupList = (props) => {

  console.log(props.groups);

  if (props.groups == null || props.groups.length===0){
    return<p> Loading...</p>
  }

  const groups = props.groups.map((group)=>{
    return(
      <li key = {group.id} className = "group-item">
      <Group group = {group}/>
      </li>
    )
  })

  console.log(groups);

  return (
    <div>
    <ul>
    {groups}
    </ul>
    </div>
  )
};

export default GroupList;
