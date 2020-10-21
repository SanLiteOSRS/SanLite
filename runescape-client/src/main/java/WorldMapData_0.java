import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1706879037
	)
	@Export("baseY")
	static int baseY;

	WorldMapData_0() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lkb;B)V",
		garbageValue = "-1"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field295.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 64;
			super.regionYLow = var1.readUnsignedShort() * 64;
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			super.groupId = var1.method5851();
			super.fileId = var1.method5851();
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-1024222647"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field196 = new byte[super.planes][64][64];
		super.field187 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class39.field287.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY) {
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false;
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1;
			return var2.regionX == super.regionX && var2.regionY == super.regionY;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;Ljava/lang/String;B)I",
		garbageValue = "-23"
	)
	public static int method269(Buffer var0, String var1) {
		int var2 = var0.offset;
		byte[] var3 = class8.method113(var1);
		var0.writeSmartByteShort(var3.length);
		var0.offset += class219.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-1892884103"
	)
	public static int method266(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-76"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			GrandExchangeOfferNameComparator.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Login.loginIndex = 3;
			Login.field1217 = 1;
		} else if (var0 == 4) {
			WorldMapDecoration.method428(0);
		} else if (var0 == 5) {
			Login.field1217 = 2;
			GrandExchangeOfferNameComparator.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) {
			GrandExchangeOfferNameComparator.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			GrandExchangeOfferNameComparator.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			GrandExchangeOfferNameComparator.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			GrandExchangeOfferNameComparator.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			GrandExchangeOfferNameComparator.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) {
			GrandExchangeOfferNameComparator.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) {
			WorldMapDecoration.method428(1);
		} else if (var0 == 19) {
			GrandExchangeOfferNameComparator.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			GrandExchangeOfferNameComparator.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			GrandExchangeOfferNameComparator.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			GrandExchangeOfferNameComparator.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
		} else if (var0 == 37) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			GrandExchangeOfferNameComparator.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			Login.loginIndex = 8;
		} else {
			if (var0 == 56) {
				GrandExchangeOfferNameComparator.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				BuddyRankComparator.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				GrandExchangeOfferNameComparator.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				BuddyRankComparator.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				Login.loginIndex = 7;
			} else {
				GrandExchangeOfferNameComparator.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
			}
		}

		BuddyRankComparator.updateGameState(10);
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		signature = "(IIIIIB)V",
		garbageValue = "94"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		WorldMapSection0.scrollBarSprites[0].drawAt(var0, var1);
		WorldMapSection0.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field925);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field765);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field747);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field747);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field747);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field747);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field746);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field746);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field746);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field746);
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		signature = "(Lht;I)I",
		garbageValue = "1533112407"
	)
	@Export("getWidgetClickMask")
	static int getWidgetClickMask(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetClickMasks.get((long)var0.childIndex + ((long)var0.id << 32));
		return var1 != null ? var1.integer : var0.clickMask;
	}
}
