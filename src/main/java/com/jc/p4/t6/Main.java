package com.jc.p4.t6;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        String cmd = "";
        Path archive = Paths.get("");
        Path directory = Paths.get("");

        switch (cmd) {
            case "pack":
                pack(archive, directory);
                break;
            case "unpack":
                unpack(archive, directory);
        }

    }

    private static void pack(Path archive, Path directory) throws Exception {
        try (YetAnotherArchiveWriter archiveWriter = new YetAnotherArchiveWriter(archive)) {
            archiveWriter.addDirectoryRecursively(directory);
        }
    }

    private static void unpack(Path archive, Path directory) throws Exception {
        try (YetAnotherArchiveReader archiveReader = new YetAnotherArchiveReader(archive)) {
            archiveReader.extracToDirectory(directory);
        }
    }
}
