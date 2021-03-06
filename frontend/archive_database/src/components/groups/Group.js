import React from "react";

const Group = (props) => {

  if (!props.group){
    return null;
  }

  const artists = props.group.artists.map((artist, index)=>{
    return <ul key={index}>{artist.name}</ul>
  })

  console.log(props.group.name)
  return(
    <div className="single-group">
      <div className="details">
        <ul>
          <li>Group Name: {props.group.name}</li>
          <li>Members:{artists}</li>
        </ul>
      </div>
    </div>
  )
}
export default Group;
