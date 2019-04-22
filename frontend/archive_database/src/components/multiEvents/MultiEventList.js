import React from "react";
import MultiEvent from "./MultiEvent"

const MultiEventList = (props) => {

    if (props.multiEvents == null || props.multiEvents.length ===0){
      return<p>Loading...</p>
    }

    const multiEvents = props.multiEvents.map((multiEvent)=>{
      return(
        <li key = {multiEvent.id} className = "multiEvent-item">
        <MultiEvent multiEvent = {multiEvent}/>
        </li>
      )
    })

    return (
      <div>
      <ul>
      {multiEvents}
      </ul>
      </div>
    )
  };

export default MultiEventList
