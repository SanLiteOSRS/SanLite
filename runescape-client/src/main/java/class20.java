import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class20 extends class16 {
	@ObfuscatedName("j")
	static byte[][][] field182;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("d")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -318023015
	)
	static int field184;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1112467139
	)
	int field178;
	@ObfuscatedName("n")
	byte field172;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 500629175
	)
	int field173;
	@ObfuscatedName("y")
	String field174;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class20(class19 var1) {
		this.this$0 = var1;
		this.field178 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "68071115"
	)
	void vmethod266(Buffer var1) {
		this.field178 = var1.readUnsignedShort();
		this.field172 = var1.readByte();
		this.field173 = var1.readUnsignedShort();
		var1.readLong();
		this.field174 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1846892157"
	)
	void vmethod264(class3 var1) {
		class9 var2 = (class9)var1.field28.get(this.field178);
		var2.field83 = this.field172;
		var2.field79 = this.field173;
		var2.field84 = this.field174;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-912438388"
	)
	public static boolean method231() {
		ReflectionCheck var0 = (ReflectionCheck)class69.reflectionChecks.last();
		return var0 != null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-253899282"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return MusicPatchNode.method4638(var0, 10, true);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-192400471"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Laf;B)V",
		garbageValue = "-93"
	)
	static void method230(GameEngine var0) {
		while (class9.isKeyDown()) {
			if (ItemComposition.field1859 == 13) {
				Login.worldSelectOpen = false;
				Login.leftTitleSprite.drawAt(Login.xPadding, 0);
				rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				Fonts.logoSprite.drawAt(Login.xPadding + 382 - Fonts.logoSprite.subWidth / 2, 18);
				return;
			}

			if (ItemComposition.field1859 == 96) {
				if (Login.worldSelectPage > 0 && class19.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (ItemComposition.field1859 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && WorldMapID.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var1 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class44.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class44.changeWorldSelectSorting(0, 1);
				return;
			}

			int var2 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class44.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class44.changeWorldSelectSorting(1, 1);
				return;
			}

			int var3 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class44.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class44.changeWorldSelectSorting(2, 1);
				return;
			}

			int var4 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class44.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class44.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				Login.worldSelectOpen = false;
				Login.leftTitleSprite.drawAt(Login.xPadding, 0);
				rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				Fonts.logoSprite.drawAt(Login.xPadding + 382 - Fonts.logoSprite.subWidth / 2, 18);
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var5 = Tiles.World_worlds[Login.hoveredWorldIndex];
				class0.changeWorld(var5);
				Login.worldSelectOpen = false;
				Login.leftTitleSprite.drawAt(Login.xPadding, 0);
				rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				Fonts.logoSprite.drawAt(Login.xPadding + 382 - Fonts.logoSprite.subWidth / 2, 18);
				return;
			}

			if (Login.worldSelectPage > 0 && class19.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class19.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= ReflectionCheck.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= ReflectionCheck.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && WorldMapID.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class32.canvasWidth - WorldMapID.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class32.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= ReflectionCheck.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= ReflectionCheck.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}
}
