import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class202 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1780874977
	)
	public int field2107;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1140378407
	)
	public int field2108;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 683378459
	)
	public int field2109;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1328376621
	)
	public int field2113;

	class202(int var1, int var2, int var3, int var4) {
		this.field2107 = 0; // L: 4
		this.field2108 = 0; // L: 5
		this.field2109 = 0; // L: 6
		this.field2113 = 0; // L: 7
		this.field2107 = var1; // L: 10
		this.field2108 = var2; // L: 11
		this.field2109 = var3; // L: 12
		this.field2113 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Lvd;",
		garbageValue = "1978049322"
	)
	public static final SpritePixels method3920(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var7 * var6]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbm;I)V",
		garbageValue = "-1796017443"
	)
	static void method3919(GameEngine var0) {
		class228 var1 = PacketBufferNode.method6051(); // L: 1907

		while (var1.method4431()) { // L: 1908
			if (var1.field2434 == 13) { // L: 1909
				AbstractWorldMapData.method5005(); // L: 1910
				return; // L: 1911
			}

			if (var1.field2434 == 96) { // L: 1913
				if (Login.worldSelectPage > 0 && WorldMapSectionType.worldSelectLeftSprite != null) { // L: 1914
					--Login.worldSelectPage; // L: 1915
				}
			} else if (var1.field2434 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class516.worldSelectRightSprite != null) { // L: 1918 1919
				++Login.worldSelectPage; // L: 1920
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !class524.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1924
			int var2 = Login.xPadding + 280; // L: 1925
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1926
				MusicPatch.changeWorldSelectSorting(0, 0); // L: 1927
				return; // L: 1928
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1930
				MusicPatch.changeWorldSelectSorting(0, 1); // L: 1931
				return; // L: 1932
			}

			int var3 = Login.xPadding + 390; // L: 1934
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1935
				MusicPatch.changeWorldSelectSorting(1, 0); // L: 1936
				return; // L: 1937
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1939
				MusicPatch.changeWorldSelectSorting(1, 1); // L: 1940
				return; // L: 1941
			}

			int var4 = Login.xPadding + 500; // L: 1943
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1944
				MusicPatch.changeWorldSelectSorting(2, 0); // L: 1945
				return; // L: 1946
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1948
				MusicPatch.changeWorldSelectSorting(2, 1); // L: 1949
				return; // L: 1950
			}

			int var5 = Login.xPadding + 610; // L: 1952
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1953
				MusicPatch.changeWorldSelectSorting(3, 0); // L: 1954
				return; // L: 1955
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1957
				MusicPatch.changeWorldSelectSorting(3, 1); // L: 1958
				return; // L: 1959
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1961
				AbstractWorldMapData.method5005(); // L: 1962
				return; // L: 1963
			}

			if (Login.hoveredWorldIndex != -1) { // L: 1965
				World var6 = WorldMapID.World_worlds[Login.hoveredWorldIndex]; // L: 1966
				boolean var7 = class59.method1133(Client.worldProperties, class529.field5174); // L: 1967
				boolean var8 = var6.isDeadman(); // L: 1968
				WorldMapScaleHandler.field2696 = var8; // L: 1969
				var6.field850 = var8 ? "beta" : var6.field850; // L: 1970
				class246.changeWorld(var6); // L: 1971
				AbstractWorldMapData.method5005(); // L: 1972
				if (var8 != var7) { // L: 1973
					class371.method7026(); // L: 1974
				}

				return; // L: 1976
			}

			if (Login.worldSelectPage > 0 && WorldMapSectionType.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= WorldMapSectionType.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= WorldMapArea.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WorldMapArea.canvasHeight / 2 + 50) { // L: 1978
				--Login.worldSelectPage; // L: 1979
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class516.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class516.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= WorldMapArea.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WorldMapArea.canvasHeight / 2 + 50) { // L: 1981
				++Login.worldSelectPage; // L: 1982
			}
		}

	} // L: 1985

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILns;ZI)V",
		garbageValue = "660409340"
	)
	static void method3918(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class485.getWorldMap().getMapArea(var0); // L: 5369
		int var4 = VarpDefinition.localPlayer.plane; // L: 5370
		int var5 = Projectile.baseX * 64 + (VarpDefinition.localPlayer.x >> 7); // L: 5371
		int var6 = GameEngine.baseY * 8 + (VarpDefinition.localPlayer.y >> 7); // L: 5372
		Coord var7 = new Coord(var4, var5, var6); // L: 5373
		class485.getWorldMap().method8925(var3, var7, var1, var2); // L: 5374
	} // L: 5375
}
