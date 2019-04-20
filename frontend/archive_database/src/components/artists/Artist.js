import React from "react";
import moment from "moment";

const Artist = (props) => {

  if(!props.artist){
    return null;
  }


  const dateBasic = props.artist.singleEvents.map((singleEvent)=>{
    return singleEvent.date
  })
  const slicedDate = dateBasic.slice(0,10)
  const formattedDate = moment(slicedDate).format("dddd Do MMM YYYY");
  const time = dateBasic.slice(11,16)


  const groups = props.artist.groups.map((group, index)=>{
    return <li key={index}>{group.name}</li>
  })

  const singleEvents = props.artist.singleEvents.map((singleEvent, index) => {
    return <li key={index}>{singleEvent.title}{singleEvent.date}</li>
  })

  return(
    <div className = "single-artist">

      <p>Name: {props.artist.name}</p>
      <p>Country: {props.artist.country}</p>
      Groups:
      <ul>
      {groups}
      </ul>
      SingleEvents:
      <ul>
      {singleEvents}
      {formattedDate}
      {time}
      </ul>
    </div>
  )
}
export default Artist;
