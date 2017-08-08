/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 */

package com.microsoft.jenkins.azurecommons.command;

public interface ICommandServiceData {
    CommandService getCommandService();

    IBaseCommandData getDataForCommand(ICommand command);
}
