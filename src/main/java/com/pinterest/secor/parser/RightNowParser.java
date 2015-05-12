package com.pinterest.secor.parser;

import java.util.Date;
import java.text.SimpleDateFormat;
import com.pinterest.secor.common.SecorConfig;
import com.pinterest.secor.message.Message;

public class RightNowParser extends MessageParser {
    private final SimpleDateFormat mOutputFormatter;
    public RightNowParser(SecorConfig config) {
        super(config);
        mOutputFormatter = new SimpleDateFormat("yyyy-MM-dd/HH");
    }

    @Override
    public String[] extractPartitions(Message message) throws Exception {
        String[] result = { mOutputFormatter.format(new Date()) };
        return result;
    }
}
