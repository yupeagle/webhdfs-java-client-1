package com.adaltas.webhdfs;

import java.util.HashMap;

public class Client {

  /**
   * java fr.edf.webhdfs.Client --principal test@EDF.FR ... put --location /user/test/my_file
   * @param args
   */
  public static void main(String[] args) {
    HashMap<String,String> general_args = new HashMap<String,String>();
    String command = null;
    HashMap<String,String> command_args = new HashMap<String,String>();
    for(int i=0; i<args.length;){
      if(args[i].substring(0,2).equals("--")){
        if(i+2 < args.length){
          throw new IllegalArgumentException("Incorrect option");
        }
        if(command == null){
          general_args.put(args[i].substring(2), args[i+1]);
        }else{
          command_args.put(args[i].substring(2), args[i+1]);
        }
      }else{
        command = args[i];
      }
      i+=2;
    }
    if(command == null){
      System.out.println("Print help");
    // [-appendToFile <localsrc> ... <dst>]
    }else if(command == "appendToFile"){
      
    // [-cat [-ignoreCrc] <src> ...]
    }else if(command == "cat"){
      
    // [-checksum <src> ...]
    }else if(command == ""){
      
    // [-chgrp [-R] GROUP PATH...]
    }else if(command == ""){
      
    // [-chmod [-R] <MODE[,MODE]... | OCTALMODE> PATH...]
    }else if(command == ""){
      
    // [-chown [-R] [OWNER][:[GROUP]] PATH...]
    }else if(command == ""){
      
    // [-copyFromLocal [-f] [-p] <localsrc> ... <dst>]
    }else if(command == ""){
      
    // [-copyToLocal [-p] [-ignoreCrc] [-crc] <src> ... <localdst>]
    }else if(command == ""){
      
    // [-count [-q] <path> ...]
    }else if(command == ""){
      
    // [-cp [-f] [-p] <src> ... <dst>]
    }else if(command == ""){
      
    // [-createSnapshot <snapshotDir> [<snapshotName>]]
    }else if(command == ""){
      
    // [-deleteSnapshot <snapshotDir> <snapshotName>]
    }else if(command == ""){
      
    // [-df [-h] [<path> ...]]
    }else if(command == ""){
      
    // [-du [-s] [-h] <path> ...]
    }else if(command == ""){
      
    // [-expunge]
    }else if(command == ""){
      
    // [-get [-p] [-ignoreCrc] [-crc] <src> ... <localdst>]
    }else if(command == ""){
      
    // [-getmerge [-nl] <src> <localdst>]
    }else if(command == ""){
      
    // [-help [cmd ...]]
    }else if(command == ""){
      
    // [-ls [-d] [-h] [-R] [<path> ...]]
    }else if(command == ""){
      
    // [-mkdir [-p] <path> ...]
    }else if(command == ""){
      
    // [-moveFromLocal <localsrc> ... <dst>]
    }else if(command == ""){
      
    // [-moveToLocal <src> <localdst>]
    }else if(command == ""){
      
    // [-mv <src> ... <dst>]
    }else if(command == ""){
      
    // [-put [-f] [-p] <localsrc> ... <dst>]
    }else if(command == ""){
      
    // [-renameSnapshot <snapshotDir> <oldName> <newName>]
    }else if(command == ""){
      
    // [-rm [-f] [-r|-R] [-skipTrash] <src> ...]
    }else if(command == ""){
      
    // [-rmdir [--ignore-fail-on-non-empty] <dir> ...]
    }else if(command == ""){
      
    // [-setrep [-R] [-w] <rep> <path> ...]
    }else if(command == ""){
      
    // [-stat [format] <path> ...]
    }else if(command == ""){
      
    // [-tail [-f] <file>]
    }else if(command == ""){
      
    // [-test -[defsz] <path>]
    }else if(command == ""){
      
    // [-text [-ignoreCrc] <src> ...]
    }else if(command == ""){
      
    // [-touchz <path> ...]
    }else if(command == ""){
      
    // [-usage [cmd ...]]
    }else if(command == ""){
      
    }
  }

}
