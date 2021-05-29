import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("o")
public class class12 extends class16 {
	@ObfuscatedName("p")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("v")
	String field125;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2090329987
	)
	int field117;
	@ObfuscatedName("f")
	byte field118;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class12(class19 var1) {
		this.this$0 = var1;
		this.field125 = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "68071115"
	)
	void vmethod266(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field125 = var1.readStringCp1252NullTerminatedOrNull();
		this.field117 = var1.readUnsignedShort();
		this.field118 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1846892157"
	)
	void vmethod264(class3 var1) {
		class9 var2 = new class9();
		var2.field84 = this.field125;
		var2.field79 = this.field117;
		var2.field83 = this.field118;
		var1.method42(var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lbg;Lbg;IZI)I",
		garbageValue = "-333331035"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1640() ? (var1.method1640() ? 0 : 1) : (var1.method1640() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1638() ? (var1.method1638() ? 0 : 1) : (var1.method1638() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "101"
	)
	static int method173(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			class44.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				class23.client.method501();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				Client.loginState = 0;
				Client.field673 = 0;
				Client.field845 = 0;
				Client.timer.method5591(var0);
				if (var0 != 20) {
					VarbitComposition.method2849(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Client.field688 != null) {
				Client.field688.close();
				Client.field688 = null;
			}

			if (Client.gameState == 25) {
				Client.field698 = 0;
				Client.field694 = 0;
				Client.field695 = 1;
				Client.field696 = 0;
				Client.field697 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					class179.method3634(SoundCache.archive10, GrandExchangeOfferAgeComparator.archive8, true, Client.gameState == 11 ? 4 : 0);
				} else if (var0 == 11) {
					class179.method3634(SoundCache.archive10, GrandExchangeOfferAgeComparator.archive8, false, 4);
				} else if (Login.clearLoginScreen) {
					class260.titleboxSprite = null;
					Login.titlebuttonSprite = null;
					Login.runesSprite = null;
					Login.leftTitleSprite = null;
					class20.rightTitleSprite = null;
					Fonts.logoSprite = null;
					Decimator.title_muteSprite = null;
					FriendSystem.options_buttons_0Sprite = null;
					GrandExchangeOffer.options_buttons_2Sprite = null;
					class337.worldSelectBackSprites = null;
					class25.worldSelectFlagSprites = null;
					HitSplatDefinition.worldSelectArrows = null;
					class18.worldSelectStars = null;
					class69.field597 = null;
					class24.loginScreenRunesAnimation.method2202();
					class159.method3192(2);
					StudioGame.method4847(true);
					Login.clearLoginScreen = false;
				}
			} else {
				class179.method3634(SoundCache.archive10, GrandExchangeOfferAgeComparator.archive8, true, 0);
			}

			Client.gameState = var0;
		}
	}
}
