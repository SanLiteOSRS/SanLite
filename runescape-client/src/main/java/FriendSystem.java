import java.net.URL;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 3633049326970285473L
	)
	static long field797;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -683802885
	)
	static int field807;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -1303524487
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -8431215
	)
	int field801;

	@ObfuscatedSignature(
		descriptor = "(Lpa;)V"
	)
	FriendSystem(LoginType var1) {
		this.field801 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "51"
	)
	boolean method1694() {
		return this.field801 == 2; // L: 32
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1539788133"
	)
	final void method1733() {
		this.field801 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "-850235504"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field801 = 2; // L: 41
		ObjectComposition.method3698(); // L: 42
	} // L: 43

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-927072501"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field4316 < class131.method2916() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					FileSystem.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					FileSystem.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "492776381"
	)
	@Export("clear")
	final void clear() {
		this.field801 = 0;
		this.friendsList.clear();
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqi;ZI)Z",
		garbageValue = "-403272270"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class28.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)Z",
		garbageValue = "0"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1969765153"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) {
					LoginScreenAnimation.method2279("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 80
				} else if (class28.localPlayer.username.equals(var2)) { // L: 84
					ScriptFrame.method1057();
				} else if (this.isFriended(var2, false)) {
					LoginScreenAnimation.method2279(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					LoginScreenAnimation.method2279("Please remove " + var1 + " from your ignore list first");
				} else {
					ApproximateRouteStrategy.method1088(var1);
				}
			}
		}
	} // L: 86 92

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "1689"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field770 != 1; // L: 120
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "188006359"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 127
			Username var2 = new Username(var1, this.loginType); // L: 128
			if (var2.hasCleanName()) { // L: 129
				if (this.canAddIgnore()) { // L: 130
					LoginScreenAnimation.method2279("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 132
				} else if (class28.localPlayer.username.equals(var2)) { // L: 136
					class6.method34(); // L: 137
				} else if (this.isIgnored(var2)) { // L: 140
					LoginScreenAnimation.method2279(var1 + " is already on your ignore list"); // L: 142
				} else if (this.isFriended(var2, false)) { // L: 146
					LoginScreenAnimation.method2279("Please remove " + var1 + " from your friend list first"); // L: 148
				} else {
					PacketBufferNode var3 = class433.getPacketBufferNode(ClientPacket.field2940, Client.packetWriter.isaacCipher); // L: 154
					var3.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var1)); // L: 155
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 156
					Client.packetWriter.addNode(var3); // L: 157
				}
			}
		}
	} // L: 134 138 144 150 159

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-72"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field770 != 1; // L: 166
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "735155702"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 173
			Username var2 = new Username(var1, this.loginType); // L: 174
			if (var2.hasCleanName()) { // L: 175
				if (this.friendsList.removeByUsername(var2)) { // L: 176
					Client.field750 = Client.cycleCntr; // L: 178
					PacketBufferNode var3 = class433.getPacketBufferNode(ClientPacket.field2956, Client.packetWriter.isaacCipher); // L: 181
					var3.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var1)); // L: 182
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 183
					Client.packetWriter.addNode(var3); // L: 184
				}

				ObjectComposition.method3698(); // L: 186
			}
		}
	} // L: 187

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-14"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 190
			Username var2 = new Username(var1, this.loginType); // L: 191
			if (var2.hasCleanName()) { // L: 192
				if (this.ignoreList.removeByUsername(var2)) { // L: 193
					Client.field750 = Client.cycleCntr; // L: 195
					PacketBufferNode var3 = class433.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher); // L: 198
					var3.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var1)); // L: 199
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 200
					Client.packetWriter.addNode(var3); // L: 201
				}

				class16.FriendSystem_invalidateIgnoreds(); // L: 203
			}
		}
	} // L: 204

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)Z",
		garbageValue = "2021397835"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 216
		return var2 != null && var2.hasWorld(); // L: 217
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2081672931"
	)
	public static void method1766(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitComposition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitComposition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit;
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1156454610"
	)
	static boolean method1696(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 61
			try {
				if (!class29.field182.startsWith("win")) { // L: 63
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 64
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 65

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 66
						if (var10.indexOf(var0.charAt(var4)) == -1) { // L: 67
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 69
					return true; // L: 70
				}
			} catch (Throwable var5) { // L: 72
				return false; // L: 73
			}
		} else if (var1 == 1) { // L: 76
			try {
				Object var3 = class27.method379(class29.field184, var2, new Object[]{(new URL(class29.field184.getCodeBase(), var0)).toString()}); // L: 78
				return var3 != null; // L: 79
			} catch (Throwable var6) { // L: 81
				return false; // L: 82
			}
		} else if (var1 == 2) { // L: 85
			try {
				class29.field184.getAppletContext().showDocument(new URL(class29.field184.getCodeBase(), var0), "_blank"); // L: 87
				return true; // L: 88
			} catch (Exception var7) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 3) { // L: 94
			try {
				class27.method378(class29.field184, "loggedout"); // L: 96
			} catch (Throwable var9) { // L: 98
			}

			try {
				class29.field184.getAppletContext().showDocument(new URL(class29.field184.getCodeBase(), var0), "_top"); // L: 100
				return true; // L: 101
			} catch (Exception var8) { // L: 103
				return false; // L: 104
			}
		} else {
			throw new IllegalArgumentException(); // L: 107
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IS)V",
		garbageValue = "12148"
	)
	static final void method1748(String var0, int var1) {
		PacketBufferNode var2 = class433.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher); // L: 208
		var2.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 209
		var2.packetBuffer.method7762(var1); // L: 210
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 211
		Client.packetWriter.addNode(var2); // L: 212
	} // L: 213

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "1782863326"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1962
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1963
			boolean var1 = var0.isMembersOnly(); // L: 1964
			if (var1 != ItemComposition.ItemComposition_inMembersWorld) { // L: 1966
				ItemComposition.ItemComposition_cached.clear(); // L: 1968
				ItemComposition.ItemComposition_cachedModels.clear(); // L: 1969
				ItemComposition.ItemComposition_cachedSprites.clear(); // L: 1970
				ItemComposition.ItemComposition_inMembersWorld = var1; // L: 1972
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 1976
			MilliClock.method3293(AbstractWorldMapData.archive8, var0.properties); // L: 1977
		}

		WorldMapSectionType.worldHost = var0.host; // L: 1979
		Client.worldId = var0.id; // L: 1980
		Client.worldProperties = var0.properties; // L: 1981
		class18.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1982
		class438.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1983
		class117.currentPort = class18.worldPort; // L: 1984
	} // L: 1985

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	protected static final void method1769() {
		class238.clock.mark(); // L: 429

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 430
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 431
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class142.gameCyclesToDo = 0; // L: 432
	} // L: 433

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "6461500"
	)
	static final void method1762(boolean var0) {
		if (var0) { // L: 3061
			Client.field645 = Login.field893 ? class124.field1515 : class124.field1518; // L: 3062
		} else {
			LinkedHashMap var1 = class260.clientPreferences.parameters; // L: 3065
			String var3 = Login.Login_username; // L: 3067
			int var4 = var3.length(); // L: 3069
			int var5 = 0; // L: 3070

			for (int var6 = 0; var6 < var4; ++var6) { // L: 3071
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field645 = var1.containsKey(var5) ? class124.field1517 : class124.field1516; // L: 3074
		}

	} // L: 3076

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "32"
	)
	static final void method1764(int var0, int var1, int var2) {
		if (WorldMapLabelSize.cameraX < var0) { // L: 3882
			WorldMapLabelSize.cameraX = (var0 - WorldMapLabelSize.cameraX) * SoundCache.field325 / 1000 + WorldMapLabelSize.cameraX + class115.field1419; // L: 3883
			if (WorldMapLabelSize.cameraX > var0) { // L: 3884
				WorldMapLabelSize.cameraX = var0;
			}
		}

		if (WorldMapLabelSize.cameraX > var0) { // L: 3886
			WorldMapLabelSize.cameraX -= (WorldMapLabelSize.cameraX - var0) * SoundCache.field325 / 1000 + class115.field1419; // L: 3887
			if (WorldMapLabelSize.cameraX < var0) { // L: 3888
				WorldMapLabelSize.cameraX = var0;
			}
		}

		if (class123.cameraY < var1) { // L: 3890
			class123.cameraY = (var1 - class123.cameraY) * SoundCache.field325 / 1000 + class123.cameraY + class115.field1419; // L: 3891
			if (class123.cameraY > var1) { // L: 3892
				class123.cameraY = var1;
			}
		}

		if (class123.cameraY > var1) { // L: 3894
			class123.cameraY -= (class123.cameraY - var1) * SoundCache.field325 / 1000 + class115.field1419; // L: 3895
			if (class123.cameraY < var1) { // L: 3896
				class123.cameraY = var1;
			}
		}

		if (Widget.cameraZ < var2) { // L: 3898
			Widget.cameraZ = (var2 - Widget.cameraZ) * SoundCache.field325 / 1000 + Widget.cameraZ + class115.field1419; // L: 3899
			if (Widget.cameraZ > var2) { // L: 3900
				Widget.cameraZ = var2;
			}
		}

		if (Widget.cameraZ > var2) { // L: 3902
			Widget.cameraZ -= (Widget.cameraZ - var2) * SoundCache.field325 / 1000 + class115.field1419; // L: 3903
			if (Widget.cameraZ < var2) { // L: 3904
				Widget.cameraZ = var2;
			}
		}

	} // L: 3906

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)Z",
		garbageValue = "1778050602"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10630
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10631
				int var2 = class343.method6335(var0, var1); // L: 10632
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10633
				if (var0.cs1Comparisons[var1] == 2) { // L: 10634
					if (var2 >= var3) { // L: 10635
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10637
					if (var2 <= var3) { // L: 10638
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10640
					if (var3 == var2) { // L: 10641
						return false;
					}
				} else if (var3 != var2) { // L: 10643
					return false;
				}
			}

			return true; // L: 10645
		}
	}
}
