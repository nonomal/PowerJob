package tech.powerjob.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 任务日志配置
 *
 * @author yhz
 * @since 2022/9/16
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class JobLogConfig {
    /**
     * log type {@link LogType}
     */
    private Integer type;
    /**
     * log level {@link tech.powerjob.common.enums.LogLevel}
     */
    private Integer level;

    @Getter
    @AllArgsConstructor
    public enum LogType {
        ONLINE(1),
        LOCAL(2);
        private final Integer v;

        public LogType of(Integer type) {
            for (LogType logType : values()) {
                if (logType.v.equals(type)) {
                    return logType;
                }
            }
            return ONLINE;
        }
    }
}
