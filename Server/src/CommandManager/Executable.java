package CommandManager;

import Managers.UserStatusManager;
import Response.Response;

/**
 * Интерфейс реализуемый каждой командой, отвечает за непосредственное выполнение команды
 */
public interface Executable {
    Response execution(String args, Object object, UserStatusManager userStatusManager);
}
