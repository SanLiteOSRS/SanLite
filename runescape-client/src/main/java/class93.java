import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("di")
public class class93 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1171;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1165;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1166;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1167;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1168;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1177;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1170;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1173;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1172;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1175;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1178;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1164;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1176;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1174;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1180;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1179;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1169;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1181;

	static {
		field1171 = new class93(); // L: 13099
		field1165 = new class93(); // L: 13100
		field1166 = new class93(); // L: 13101
		field1167 = new class93(); // L: 13102
		field1168 = new class93(); // L: 13103
		field1177 = new class93(); // L: 13104
		field1170 = new class93(); // L: 13105
		field1173 = new class93(); // L: 13106
		field1172 = new class93(); // L: 13107
		field1175 = new class93(); // L: 13108
		field1178 = new class93(); // L: 13109
		field1164 = new class93(); // L: 13110
		field1176 = new class93(); // L: 13111
		field1174 = new class93(); // L: 13112
		field1180 = new class93(); // L: 13113
		field1179 = new class93(); // L: 13114
		field1169 = new class93(); // L: 13115
		field1181 = new class93(); // L: 13116
	}

	class93() {
	} // L: 13118

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;IZI)Lfc;",
		garbageValue = "-1532755804"
	)
	public static class140 method2440(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 32
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535); // L: 33
		if (var5 == null) { // L: 34
			var4 = false; // L: 35
			return null; // L: 36
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255; // L: 38
			byte[] var7;
			if (var3) { // L: 40
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0); // L: 41
			}

			if (var7 == null) { // L: 42
				var4 = false;
			}

			if (!var4) { // L: 43
				return null;
			} else {
				if (GrandExchangeOfferUnitPriceComparator.field4467 == null) { // L: 44
					class520.field5121 = Runtime.getRuntime().availableProcessors(); // L: 45
					GrandExchangeOfferUnitPriceComparator.field4467 = new ThreadPoolExecutor(0, class520.field5121, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class520.field5121 * 100 + 100), new class137()); // L: 46
				}

				try {
					return new class140(var0, var1, var2, var3); // L: 54
				} catch (Exception var9) { // L: 56
					return null; // L: 57
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfr;B)V",
		garbageValue = "5"
	)
	static void method2443(float var0, float var1, float var2, float var3, class132 var4) {
		float var5 = var1 - var0; // L: 343
		float var6 = var2 - var1; // L: 344
		float var7 = var3 - var2; // L: 345
		float var8 = var6 - var5; // L: 346
		var4.field1570 = var7 - var6 - var8; // L: 347
		var4.field1573 = var8 + var8 + var8; // L: 348
		var4.field1569 = var5 + var5 + var5; // L: 349
		var4.field1567 = var0; // L: 350
	} // L: 351

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	static final int method2438() {
		return ViewportMouse.ViewportMouse_y; // L: 111
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "534540991"
	)
	static int method2441(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1232
			if (var1 <= var0 + 30) { // L: 1233
				return var2; // L: 1234
			}

			var0 += 30; // L: 1236
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1237
		}

		return 0; // L: 1239
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-884462320"
	)
	static int method2439(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4469
			Interpreter.Interpreter_intStackSize -= 2; // L: 4470
			Client.field724 = (short)Skeleton.method5416(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 4471
			if (Client.field724 <= 0) { // L: 4472
				Client.field724 = 256;
			}

			Client.field803 = (short)Skeleton.method5416(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4473
			if (Client.field803 <= 0) { // L: 4474
				Client.field803 = 256;
			}

			return 1; // L: 4475
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4477
			Interpreter.Interpreter_intStackSize -= 2; // L: 4478
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4479
			if (Client.zoomHeight <= 0) { // L: 4480
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4481
			if (Client.zoomWidth <= 0) { // L: 4482
				Client.zoomWidth = 320;
			}

			return 1; // L: 4483
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4485
			Interpreter.Interpreter_intStackSize -= 4; // L: 4486
			Client.field806 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4487
			if (Client.field806 <= 0) { // L: 4488
				Client.field806 = 1;
			}

			Client.field807 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4489
			if (Client.field807 <= 0) { // L: 4490
				Client.field807 = 32767;
			} else if (Client.field807 < Client.field806) { // L: 4491
				Client.field807 = Client.field806;
			}

			Client.field722 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4492
			if (Client.field722 <= 0) { // L: 4493
				Client.field722 = 1;
			}

			Client.field809 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 4494
			if (Client.field809 <= 0) { // L: 4495
				Client.field809 = 32767;
			} else if (Client.field809 < Client.field722) { // L: 4496
				Client.field809 = Client.field722;
			}

			return 1; // L: 4497
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4499
			if (Client.viewportWidget != null) { // L: 4500
				class148.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4501
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4502
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4503
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4506
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4507
			}

			return 1; // L: 4509
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4511
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4512
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4513
			return 1; // L: 4514
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4516
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class378.method7241(Client.field724); // L: 4517
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class378.method7241(Client.field803); // L: 4518
			return 1; // L: 4519
		} else if (var0 == 6220) { // L: 4521
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4522
			return 1; // L: 4523
		} else if (var0 == 6221) { // L: 4525
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4526
			return 1; // L: 4527
		} else if (var0 == 6222) { // L: 4529
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 4530
			return 1; // L: 4531
		} else if (var0 == 6223) { // L: 4533
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArea.canvasHeight; // L: 4534
			return 1; // L: 4535
		} else {
			return 2; // L: 4537
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1517887348"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = SoundSystem.method808(); // L: 2873
		if (var0 == -3) { // L: 2874
			class114.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2875
			class114.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2876
			class114.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2877
			JagexCache.method4224(3); // L: 2878
			Login.field977 = 1; // L: 2879
		} else if (var0 == 4) { // L: 2881
			class150.method3272(0); // L: 2882
		} else if (var0 == 5) { // L: 2884
			Login.field977 = 2; // L: 2885
			class114.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2886
		} else if (var0 == 68) { // L: 2888
			if (!Client.field532) { // L: 2889
				Client.field532 = true; // L: 2890
				class371.method7026(); // L: 2891
				return; // L: 2892
			}

			class114.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2895
		} else if (!Client.onMobile && var0 == 6) { // L: 2898
			class114.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2899
		} else if (var0 == 7) { // L: 2901
			class114.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2902
			class114.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2903
			class114.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2904
			class114.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2905
			class114.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2906
			class114.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2907
			class114.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2908
			class114.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2909
			class114.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2910
			JagexCache.method4224(33); // L: 2911
		} else if (var0 == 17) { // L: 2913
			class114.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2914
			class150.method3272(1); // L: 2915
		} else if (var0 == 19) { // L: 2917
			class114.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2918
			class114.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2919
			class114.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2920
			class114.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2921
			class114.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2922
			class114.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class114.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", ""); // L: 2923
		} else if (var0 == 27) { // L: 2924
			class114.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2925
			class114.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 2926
			class150.method3272(2); // L: 2927
		} else if (var0 == 37) { // L: 2929
			class114.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2930
			class114.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) { // L: 2931
			class114.setLoginResponseString("This world is running a", "closed beta. Please", "use a different world.");
		} else if (var0 == 55) { // L: 2932
			JagexCache.method4224(8); // L: 2933
		} else {
			if (var0 == 56) { // L: 2935
				class114.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2936
				Interpreter.method2106(11); // L: 2937
				return; // L: 2938
			}

			if (var0 == 57) { // L: 2940
				class114.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2941
				Interpreter.method2106(11); // L: 2942
				return; // L: 2943
			}

			if (var0 == 61) { // L: 2945
				class114.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2946
				JagexCache.method4224(7); // L: 2947
			} else {
				if (var0 == 62) { // L: 2949
					Interpreter.method2106(10); // L: 2950
					JagexCache.method4224(9); // L: 2951
					class114.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2952
					return; // L: 2953
				}

				if (var0 == 63) { // L: 2955
					Interpreter.method2106(10); // L: 2956
					JagexCache.method4224(9); // L: 2957
					class114.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2958
					return; // L: 2959
				}

				if (var0 == 65 || var0 == 67) { // L: 2961
					Interpreter.method2106(10); // L: 2962
					JagexCache.method4224(9); // L: 2963
					class114.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2964
					return; // L: 2965
				}

				if (var0 == 71) { // L: 2967
					Interpreter.method2106(10); // L: 2968
					JagexCache.method4224(7); // L: 2969
					class114.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2970
				} else if (var0 == 73) { // L: 2972
					Interpreter.method2106(10); // L: 2973
					JagexCache.method4224(6); // L: 2974
					class114.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2975
				} else if (var0 == 72) { // L: 2977
					Interpreter.method2106(10); // L: 2978
					JagexCache.method4224(32); // L: 2979
				} else {
					class114.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2981
				}
			}
		}

		Interpreter.method2106(10); // L: 2982
		boolean var2 = var1 != SoundSystem.method808(); // L: 2983
		if (!var2 && Client.field563.method9755()) { // L: 2984
			JagexCache.method4224(9); // L: 2985
		}

	} // L: 2987

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "25"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11478
	} // L: 11479

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1456462183"
	)
	static final void method2442(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class316.guestClanChannel; // L: 12726
		if (var2 != null && var1 >= 0 && var1 < var2.method3481()) { // L: 12727
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12728
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12730
				PacketBufferNode var5 = ViewportMouse.getPacketBufferNode(ClientPacket.field3198, Client.packetWriter.isaacCipher); // L: 12731
				var5.packetBuffer.writeByte(3 + class145.stringCp1252NullTerminatedByteSize(var4)); // L: 12732
				var5.packetBuffer.writeByte(var0); // L: 12733
				var5.packetBuffer.writeShort(var1); // L: 12734
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12735
				Client.packetWriter.addNode(var5); // L: 12736
			}
		}
	} // L: 12729 12737
}
