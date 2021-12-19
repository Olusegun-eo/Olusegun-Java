import React from 'react'
// import MailIcon from "@material-ui/icons/Mail";                                                     
// import HomeIcon from "@material-ui/icons/Home";
// import DashboardIcon from "@material-ui/icons/              Dashboard";                                                               
// import AssessmentIcon from "@material-ui/icons/Assessment";                     
// import GroupIcon from "@material-ui/icons/Group";                           
import HomeIcon from "@mui/icons-material/Home";
import MailIcon from "@mui/icons-material/Mail";
import DashboardIcon from "@mui/icons-material/Dashboard";
import AssessmentIcon from "@mui/icons-material/Assessment";
import GroupIcon from "@mui/icons-material/Group";
import PhotoIcon from "@mui/icons-material/Photo";



export const SideBarData = [
  { title: "Home", icons: <HomeIcon />, link: "/home" },
  { title: "Mailbox", icons: <MailIcon />, link: "/mailbox" },
  { title: "Dashboard", icons: <DashboardIcon />, link: "/dashboard" },
  { title: "Analytics", icons: <AssessmentIcon />, link: "/analytics" },
  { title: "Friends", icons: <GroupIcon />, link: "/friends" },
  { title: "Images", icons: <PhotoIcon />, link: "/images" }
];
