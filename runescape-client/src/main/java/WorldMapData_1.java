import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hc")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("uz")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1540818723
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1273854217
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1262571631
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 391822755
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;B)V",
		garbageValue = "-43"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field2841.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort() * 4096; // L: 20
			super.regionYLow = var1.readUnsignedShort() * 64; // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte(); // L: 27
			super.groupId = var1.method7752(); // L: 28
			super.fileId = var1.method7752(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;B)V",
		garbageValue = "1"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 34
		super.floorUnderlayIds = new short[1][64][64]; // L: 35
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 36
		super.field2796 = new byte[super.planes][64][64]; // L: 37
		super.field2793 = new byte[super.planes][64][64]; // L: 38
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 39
		int var2 = var1.readUnsignedByte(); // L: 40
		if (var2 != class238.field2831.value) { // L: 41
			throw new IllegalStateException(""); // L: 42
		} else {
			int var3 = var1.readUnsignedByte(); // L: 44
			int var4 = var1.readUnsignedByte(); // L: 45
			int var5 = var1.readUnsignedByte(); // L: 46
			int var6 = var1.readUnsignedByte(); // L: 47
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 48
				for (int var7 = 0; var7 < 8; ++var7) { // L: 51
					for (int var8 = 0; var8 < 8; ++var8) { // L: 52
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 53
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 49
			}
		}
	} // L: 56

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1606384690"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 76
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "702888353"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 80
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "364294110"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 84
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "418959705"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 88
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 60
			return false; // L: 61
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 63
			if (super.regionX == var2.regionX && var2.regionY == super.regionY) { // L: 64
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY; // L: 67
			} else {
				return false; // L: 65
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 72
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-2137190609"
	)
	static int method4832(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 1209
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1210
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.itemId; // L: 1211
			return 1; // L: 1212
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1214
			if (var3.itemId != -1) { // L: 1215
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1216
			}

			return 1; // L: 1217
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1219
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1220
			return 1; // L: 1221
		} else if (var0 == 1707) { // L: 1223
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.method5640() ? 1 : 0; // L: 1224
			return 1; // L: 1225
		} else if (var0 == 1708) { // L: 1227
			return PacketWriter.method2600(var3); // L: 1228
		} else {
			return var0 == 1709 ? HealthBar.method2410(var3) : 2; // L: 1230 1231 1233
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-103"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2827
		if (var0 == -3) { // L: 2830
			HealthBarUpdate.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2831
			HealthBarUpdate.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2832
			HealthBarUpdate.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2833
			UserComparator6.method2701(3); // L: 2834
			Login.field919 = 1; // L: 2835
		} else if (var0 == 4) { // L: 2837
			class67.method1935(0); // L: 2838
		} else if (var0 == 5) { // L: 2840
			Login.field919 = 2; // L: 2841
			HealthBarUpdate.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2842
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) { // L: 2844
			HealthBarUpdate.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2845
		} else if (var0 == 7) { // L: 2847
			HealthBarUpdate.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2848
			HealthBarUpdate.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2849
			HealthBarUpdate.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2850
			HealthBarUpdate.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2851
			HealthBarUpdate.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2852
			HealthBarUpdate.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2853
			HealthBarUpdate.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2854
			HealthBarUpdate.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2855
			HealthBarUpdate.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) { // L: 2856
			HealthBarUpdate.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2857
			class67.method1935(1); // L: 2858
		} else if (var0 == 19) { // L: 2860
			HealthBarUpdate.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2861
			HealthBarUpdate.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2862
			HealthBarUpdate.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2863
			HealthBarUpdate.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2864
			HealthBarUpdate.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2865
			HealthBarUpdate.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2866
			HealthBarUpdate.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2867
			HealthBarUpdate.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			HealthBarUpdate.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game."); // L: 2868
		} else if (var0 == 32) { // L: 2869
			class67.method1935(2); // L: 2870
		} else if (var0 == 37) { // L: 2872
			HealthBarUpdate.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2873
			HealthBarUpdate.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2874
			UserComparator6.method2701(8); // L: 2875
		} else {
			if (var0 == 56) { // L: 2877
				HealthBarUpdate.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2878
				class82.updateGameState(11); // L: 2879
				return; // L: 2880
			}

			if (var0 == 57) { // L: 2882
				HealthBarUpdate.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2883
				class82.updateGameState(11); // L: 2884
				return; // L: 2885
			}

			if (var0 == 61) { // L: 2887
				HealthBarUpdate.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2888
				UserComparator6.method2701(7); // L: 2889
			} else {
				if (var0 == 62) { // L: 2891
					class82.updateGameState(10); // L: 2892
					UserComparator6.method2701(9); // L: 2893
					HealthBarUpdate.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2894
					return; // L: 2895
				}

				if (var0 == 63) { // L: 2897
					class82.updateGameState(10); // L: 2898
					UserComparator6.method2701(9); // L: 2899
					HealthBarUpdate.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2900
					return; // L: 2901
				}

				if (var0 == 65 || var0 == 67) { // L: 2903
					class82.updateGameState(10); // L: 2904
					UserComparator6.method2701(9); // L: 2905
					HealthBarUpdate.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2906
					return; // L: 2907
				}

				if (var0 == 71) { // L: 2909
					class82.updateGameState(10); // L: 2910
					UserComparator6.method2701(7); // L: 2911
					HealthBarUpdate.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2912
				} else if (var0 == 73) { // L: 2914
					class82.updateGameState(10); // L: 2915
					UserComparator6.method2701(6); // L: 2916
					HealthBarUpdate.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2917
				} else if (var0 == 72) { // L: 2919
					class82.updateGameState(10); // L: 2920
					UserComparator6.method2701(26); // L: 2921
				} else {
					HealthBarUpdate.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2923
				}
			}
		}

		class82.updateGameState(10); // L: 2924
		int var4 = Login.loginIndex; // L: 2928
		boolean var5 = var4 != var1; // L: 2930
		if (!var5 && Client.field741.method8024()) { // L: 2931
			UserComparator6.method2701(9); // L: 2932
		}

	} // L: 2934
}
