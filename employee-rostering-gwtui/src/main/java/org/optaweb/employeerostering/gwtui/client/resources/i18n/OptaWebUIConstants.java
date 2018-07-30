/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaweb.employeerostering.gwtui.client.resources.i18n;

import org.jboss.errai.ui.shared.api.annotations.TranslationKey;

public interface OptaWebUIConstants {

    @TranslationKey(
                    defaultValue = "The server returned an empty result which is impossible.\nMaybe the server is using the wrong WildFly version.")
    final String AbstractRosterViewPanel_emptyResult = "AbstractRosterViewPanel.emptyResult";

    @TranslationKey(defaultValue = "Finished solving")
    final String AbstractRosterViewPanel_finishedSolving = "AbstractRosterViewPanel.finishedSolving";

    @TranslationKey(defaultValue = "Solve")
    final String AbstractRosterViewPanel_solve = "AbstractRosterViewPanel.solve";

    @TranslationKey(defaultValue = "Solving for another")
    final String AbstractRosterViewPanel_solvingFor = "AbstractRosterViewPanel.solvingFor";

    @TranslationKey(defaultValue = "AbstractRosterViewPanel.startSolving")
    final String AbstractRosterViewPanel_startSolving = "Click the <i>Solve</i> button to start solving.";

    @TranslationKey(defaultValue = "AbstractRosterViewPanel.terminateEarly")
    final String AbstractRosterViewPanel_terminateEarly = "Terminate";

    @TranslationKey(defaultValue = "Week {0}")
    final String DateDisplay_WEEKS_FROM_EPOCH = "DateDisplay.WEEKS_FROM_EPOCH";

    @TranslationKey(defaultValue = "Week starting {0}/{1}/{2}")
    final String DateDisplay_WEEK_STARTING = "DateDisplay.WEEK_STARTING";

    @TranslationKey(defaultValue = "Week ending {0}/{1}/{2}")
    final String DateDisplay_WEEK_ENDING = "DateDisplay.WEEK_ENDING";

    @TranslationKey(defaultValue = "Desired")
    final String EmployeeAvailabilityState_DESIRED = "EmployeeAvailabilityState.DESIRED";

    @TranslationKey(defaultValue = "Undesired")
    final String EmployeeAvailabilityState_UNDESIRED = "EmployeeAvailabilityState.UNDESIRED";

    @TranslationKey(defaultValue = "Unavailable")
    final String EmployeeAvailabilityState_UNAVAILABLE = "EmployeeAvailabilityState.UNAVAILABLE";

    @TranslationKey(defaultValue = "Employee name")
    final String EmployeeListPanel_employeeName = "EmployeeListPanel.employeeName";

    @TranslationKey(defaultValue = "Actions")
    final String General_actions = "General.actions";

    @TranslationKey(defaultValue = "Add")
    final String General_add = "General.add";

    @TranslationKey(defaultValue = "Cancel")
    final String General_cancel = "General.cancel";

    @TranslationKey(defaultValue = "Confirm")
    final String General_confirm = "General.confirm";

    @TranslationKey(defaultValue = "Delete")
    final String General_delete = "General.delete";

    @TranslationKey(defaultValue = "Edit")
    final String General_edit = "General.edit";

    @TranslationKey(defaultValue = "Update")
    final String General_update = "General.update";

    @TranslationKey(defaultValue = "Employee")
    final String General_employee = "General.employee";

    @TranslationKey(defaultValue = "Name")
    final String General_name = "General.name";

    @TranslationKey(defaultValue = "Refresh")
    final String General_refresh = "General.refresh";

    @TranslationKey(defaultValue = "Skills")
    final String General_skills = "General.skills";

    @TranslationKey(defaultValue = "Availability Roster")
    final String MenuPanel_availabilityRoster = "MenuPanel.availabilityRoster";

    @TranslationKey(defaultValue = "Employees")
    final String MenuPanel_employees = "MenuPanel.employees";

    @TranslationKey(defaultValue = "Rest API")
    final String MenuPanel_restAPI = "MenuPanel.restAPI";

    @TranslationKey(defaultValue = "Shift Roster")
    final String MenuPanel_shiftRoster = "MenuPanel.shiftRoster";

    @TranslationKey(defaultValue = "Spots")
    final String MenuPanel_spots = "MenuPanel.spots";

    @TranslationKey(defaultValue = "Tenant")
    final String MenuPanel_tenant = "MenuPanel.tenant";

    @TranslationKey(defaultValue = "Toggle navigation")
    final String MenuPanel_toggleNavigation = "MenuPanel.toggleNavigation";

    @TranslationKey(defaultValue = "Unassigned")
    final String Shift_unassigned = "Shift.unassigned";

    @TranslationKey(defaultValue = "Spot")
    final String ShiftRosterView_spot = "ShiftRosterView.spot";

    @TranslationKey(defaultValue = "Skill name")
    final String SkillListPanel_skillName = "SkillListPanel.skillName";

    @TranslationKey(defaultValue = "Required skill")
    final String SpotListPanel_requiredSkill = "SpotListPanel.requiredSkill";

    @TranslationKey(defaultValue = "Spot name")
    final String SpotListPanel_spotName = "SpotListPanel.spotName";

    @TranslationKey(defaultValue = "Day {1}")
    final String Rotation_dateHeader = "Rotation.dateHeader";

}
