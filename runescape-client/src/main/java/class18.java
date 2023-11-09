import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class18 {
	@ObfuscatedName("hm")
	static int[] field95;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 1844305955
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("su")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("aj")
	Future field100;
	@ObfuscatedName("al")
	String field90;

	class18(Future var1) {
		this.field100 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method262(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-764874737"
	)
	void method262(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field90 = var1;
		if (this.field100 != null) {
			this.field100.cancel(true);
			this.field100 = null;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2045450839"
	)
	public final String method269() {
		return this.field90;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-26"
	)
	public boolean method272() {
		return this.field90 != null || this.field100 == null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "84"
	)
	public final boolean method264() {
		return this.method272() ? true : this.field100.isDone();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Laf;",
		garbageValue = "15"
	)
	public final class20 method265() {
		if (this.method272()) {
			return new class20(this.field90);
		} else if (!this.method264()) {
			return null;
		} else {
			try {
				return (class20)this.field100.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method262(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "637215135"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) { // L: 27
			var1 = -110;
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILmy;IIIII[FI)Lmy;",
		garbageValue = "-860762282"
	)
	static Widget method260(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 883
		var8.type = var0; // L: 884
		var8.parentId = var1.id; // L: 885
		var8.childIndex = var2; // L: 886
		var8.isIf3 = true; // L: 887
		var8.xAlignment = var3; // L: 888
		var8.yAlignment = var4; // L: 889
		var8.widthAlignment = var5; // L: 890
		var8.heightAlignment = var6; // L: 891
		var8.rawX = (int)((float)var1.width * var7[0]); // L: 892
		var8.rawY = (int)(var7[1] * (float)var1.height); // L: 893
		var8.rawWidth = (int)((float)var1.width * var7[2]); // L: 894
		var8.rawHeight = (int)((float)var1.height * var7[3]); // L: 895
		return var8; // L: 896
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Ldq;B)V",
		garbageValue = "-65"
	)
	static final void method273(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 3950
		if (var0.pathLength == 0) { // L: 3951
			var0.field1214 = 0; // L: 3952
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3955
				SequenceDefinition var1 = Coord.SequenceDefinition_get(var0.sequence); // L: 3956
				if (var0.field1215 > 0 && var1.field2277 == 0) { // L: 3957
					++var0.field1214; // L: 3958
					return; // L: 3959
				}

				if (var0.field1215 <= 0 && var1.field2255 == 0) { // L: 3961
					++var0.field1214; // L: 3962
					return; // L: 3963
				}
			}

			int var10 = var0.x; // L: 3966
			int var2 = var0.y; // L: 3967
			int var3 = var0.field1142 * -1172500480 + var0.pathX[var0.pathLength - 1] * 128; // L: 3968
			int var4 = var0.field1142 * -1172500480 + var0.pathY[var0.pathLength - 1] * 128; // L: 3969
			if (var10 < var3) { // L: 3970
				if (var2 < var4) { // L: 3971
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 3972
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 3973
				}
			} else if (var10 > var3) { // L: 3975
				if (var2 < var4) { // L: 3976
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 3977
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 3978
				}
			} else if (var2 < var4) { // L: 3980
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 3981
				var0.orientation = 0;
			}

			class211 var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 3982
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 3983
				int var6 = var0.orientation - var0.rotation & 2047; // L: 3990
				if (var6 > 1024) { // L: 3991
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 3992
				if (var6 >= -256 && var6 <= 256) { // L: 3993
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 3994
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 3995
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 3996
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 3997
				int var8 = 4; // L: 3998
				boolean var9 = true; // L: 3999
				if (var0 instanceof NPC) { // L: 4000
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4001
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1209 != 0) { // L: 4002
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4003
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4004
						var8 = 8;
					}

					if (var0.field1214 > 0 && var0.pathLength > 1) { // L: 4005
						var8 = 8; // L: 4006
						--var0.field1214; // L: 4007
					}
				} else {
					if (var0.pathLength > 1) { // L: 4011
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4012
						var8 = 8;
					}

					if (var0.field1214 > 0 && var0.pathLength > 1) { // L: 4013
						var8 = 8; // L: 4014
						--var0.field1214; // L: 4015
					}
				}

				if (var5 == class211.field2335) { // L: 4018
					var8 <<= 1;
				} else if (var5 == class211.field2333) { // L: 4019
					var8 >>= 1;
				}

				if (var8 >= 8) { // L: 4020
					if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4021
						var0.movementSequence = var0.runSequence;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1152 != -1) { // L: 4022
						var0.movementSequence = var0.field1152;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1153 != -1) { // L: 4023
						var0.movementSequence = var0.field1153;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1154 != -1) { // L: 4024
						var0.movementSequence = var0.field1154;
					}
				} else if (var8 <= 1) { // L: 4026
					if (var0.walkSequence == var0.movementSequence && var0.field1155 != -1) { // L: 4027
						var0.movementSequence = var0.field1155;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1200 != -1) { // L: 4028
						var0.movementSequence = var0.field1200;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1212 != -1) { // L: 4029
						var0.movementSequence = var0.field1212;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1158 != -1) { // L: 4030
						var0.movementSequence = var0.field1158;
					}
				}

				if (var10 != var3 || var2 != var4) { // L: 4032
					if (var10 < var3) { // L: 4033
						var0.x += var8; // L: 4034
						if (var0.x > var3) { // L: 4035
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4037
						var0.x -= var8; // L: 4038
						if (var0.x < var3) { // L: 4039
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4041
						var0.y += var8; // L: 4042
						if (var0.y > var4) { // L: 4043
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4045
						var0.y -= var8; // L: 4046
						if (var0.y < var4) { // L: 4047
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4050
					--var0.pathLength; // L: 4051
					if (var0.field1215 > 0) { // L: 4052
						--var0.field1215;
					}
				}

			} else {
				var0.x = var3; // L: 3984
				var0.y = var4; // L: 3985
				--var0.pathLength; // L: 3986
				if (var0.field1215 > 0) { // L: 3987
					--var0.field1215;
				}

			}
		}
	} // L: 3953 3988 4054

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2099476931"
	)
	static final void method276() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7927 7928 7971
			if (var0.hitpoints > 0) { // L: 7929
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) { // L: 7930
				if (var0.objectId >= 0) { // L: 7932
					var2 = var0.objectId; // L: 7934
					var3 = var0.field1130; // L: 7935
					var4 = DecorativeObject.getObjectDefinition(var2); // L: 7937
					if (var3 == 11) { // L: 7938
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) { // L: 7939
						var3 = 4;
					}

					var1 = var4.method3868(var3); // L: 7940
					if (!var1) { // L: 7942
						continue;
					}
				}

				class149.method3179(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1128, var0.field1130, var0.field1133); // L: 7944
				var0.remove(); // L: 7945
			} else {
				if (var0.delay > 0) { // L: 7949
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) { // L: 7950
					if (var0.field1135 >= 0) { // L: 7952
						var2 = var0.field1135; // L: 7954
						var3 = var0.field1132; // L: 7955
						var4 = DecorativeObject.getObjectDefinition(var2); // L: 7957
						if (var3 == 11) { // L: 7958
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) { // L: 7959
							var3 = 4;
						}

						var1 = var4.method3868(var3); // L: 7960
						if (!var1) { // L: 7962
							continue;
						}
					}

					class149.method3179(var0.plane, var0.type, var0.x, var0.y, var0.field1135, var0.field1131, var0.field1132, var0.field1133); // L: 7964
					var0.delay = -1; // L: 7965
					if (var0.objectId == var0.field1135 && var0.objectId == -1) { // L: 7966
						var0.remove();
					} else if (var0.field1135 == var0.objectId && var0.field1128 == var0.field1131 && var0.field1132 == var0.field1130) { // L: 7967
						var0.remove();
					}
				}
			}
		}

	} // L: 7973
}
