
# GetCharactersCharacterIdFleetOk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fleetId** | **Long** | The character&#39;s current fleet ID | 
**role** | [**RoleEnum**](#RoleEnum) | Member’s role in fleet | 
**squadId** | **Long** | ID of the squad the member is in. If not applicable, will be set to -1 | 
**wingId** | **Long** | ID of the wing the member is in. If not applicable, will be set to -1 | 


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
FLEET_COMMANDER | &quot;fleet_commander&quot;
SQUAD_COMMANDER | &quot;squad_commander&quot;
SQUAD_MEMBER | &quot;squad_member&quot;
WING_COMMANDER | &quot;wing_commander&quot;



