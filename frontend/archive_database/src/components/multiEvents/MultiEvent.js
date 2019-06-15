import React from "react";

const MultiEvent = (props) => {

  if(!props.multiEvent){
    return null;
  }



  return(
    <div className = "single-multiEvent">
      <div className="details">
        <p>Name: {props.multiEvent.multiEventName}</p>
        <p>Year: {props.multiEvent.year}</p>
      </div>
    </div>
  )
}
export default MultiEvent;
