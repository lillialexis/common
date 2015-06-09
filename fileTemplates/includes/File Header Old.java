#if ($HEADER_COMMENTS)
#parse("Variables.java")

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
// 
#if ($OrgName && $OrgName != "")
// Copyright (c) $YEAR ${OrgName}#if (!$OrgName.endsWith(".")).#end

//
#end
// This program is licensed under the terms and conditions of the
// Mozilla Public License, version 2.0. The full text of the 
// Mozilla Public License is at https://www.mozilla.org/MPL/2.0/
// 
// File:    ${FILE_NAME}
// Project: ${PROJECT_NAME}
// 
// Created by $MyName on ${DATE}.
//
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

#end