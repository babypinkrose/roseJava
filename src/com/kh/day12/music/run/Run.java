package com.kh.day12.music.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.controller.MusicController;
import com.kh.day12.music.model.vo.Music;
import com.kh.day12.music.view.MusicView;

public class Run {
	public static void main(String[] args) {
		MusicView view = new MusicView();
		MusicController mController = new MusicController();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Music music = null;
		String title = "";
		int index = 0;
		do {
			choice = view.musicMenu();
			switch(choice) {
			// MusicFunction -> MusicView, MusicController 두개로 나누고
			// 매개변수를 통해서 연결함
			case 1 : 
				music = view.inputMusicInfo();
				mController.addAtLast(music);
				view.displaySuccess("마지막 위치에 추가 성공!\n");
				break;
			case 2 : 
				music = view.inputMusicInfo();
				mController.addAtFirst(music);
				view.displaySuccess("첫번째 위치에 추가 성공!\n");
				break;
			case 3 : 
				List<Music> allList = mController.printMusicList();
				view.showAllMusicList(allList);
				view.displaySuccess("전체 정보 조회 성공!\n");
				break;
			case 4 : 
				title = view.inputMusicName("검색");
				List<Music> searchList =
				mController.searchMusicsByName(title);
				view.showAllMusicList(searchList);
				view.displaySuccess("검색한 " + title + " 조회 성공!");
				break;
			case 5 : 
				title = view.inputMusicName("삭제");
				index = mController.searchOneByTitle(title);
				if(index == -1) {
					view.displayError("존재하지 않습니다");
				}
				view.displaySuccess("\n" + title + " 삭제 성공!");
				break;
			case 6 : 
				// 수정할 곳 입력받고
				title = view.inputMusicName("수정");
				// 존재여부 확인하고
				index = mController.searchOneByTitle(title);
				if(index == -1) {
					view.displayError("존재하지 않습니다");
				}
				// 이후 수정하기
				// 수정할 정보 입력받기
				music = view.modifyMusicInfo();
				//수정하기
				mController.updateMusic(index, music);
				view.displaySuccess("\n" + title + " 수정 성공!");
				break;
			case 7 :
				view.printMessage("\n♬~♪~♩~♬~♪~♩ 곡명 오름차순 정렬 ♬~♪~♩~♬~♪~♩\n");
				mController.bubbleSortByTitleASC();
				view.printMessage("정렬 성공! 3번을 눌러 출력해주세요!");
				break;
			case 8 : 
				view.printMessage("\n♬~♪~♩~♬~♪~♩ 곡명 내림차순 정렬 ♬~♪~♩~♬~♪~♩\n");
				mController.bubbleSortByTitleDESC();
				view.printMessage("정렬 성공! 3번을 눌러 출력해주세요!");
				break;
			case 9 : 
				view.printMessage("\n♬~♪~♩~♬~♪~♩ 가수명 오름차순 정렬 ♬~♪~♩~♬~♪~♩\n");
				mController.bubbleSortBySingerASC();
				view.printMessage("정렬 성공! 3번을 눌러 출력해주세요!");
				break;
			case 10 : 
				view.printMessage("\n♬~♪~♩~♬~♪~♩ 가수명 내림차순 정렬 ♬~♪~♩~♬~♪~♩\n");
				mController.bubbleSortBySingerDESC();
				view.printMessage("정렬 성공! 3번을 눌러 출력해주세요!");
				break;
			case 0 : view.printMessage("프로그램을 종료합니다."); break;
			default : 
				view.printMessage("\n잘못 입력하셨습니다.");
				break;
			}
		}while(choice != 0);
	}
}
