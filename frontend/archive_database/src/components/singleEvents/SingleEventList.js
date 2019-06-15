import React from "react";
import SingleEvent from "./singleEvent"

const SingleEventList = (props) => {

  if (props.singleEvents == null || props.singleEvents.length ===0){
    return <p>Loading...</p>
  }

  const singleEvents = props.singleEvents.map((singleEvent)=>{
    return(
      <li key = {singleEvent.id} className = "singleEvent-item">
      <SingleEvent singleEvent = {singleEvent}/>
      </li>
    )
  })

  return (
    <div>
    <ul>
    {singleEvents}
    </ul>
    </div>
  )
};

export default SingleEventList
