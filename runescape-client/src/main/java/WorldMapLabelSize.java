import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = -1981266759
	)
	static int field1569;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ley;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ley;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ley;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2016472085
	)
	static int field1568;
	@ObfuscatedName("h")
	static int[][] field1570;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 464910607
	)
	static int field1572;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -27286113
	)
	final int field1564;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 580411911
	)
	final int field1567;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1572047245
	)
	final int field1571;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field1564 = var1;
		this.field1567 = var2;
		this.field1571 = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(FI)Z",
		garbageValue = "-1990451087"
	)
	boolean method2671(float var1) {
		return var1 >= (float)this.field1571;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;I)V",
		garbageValue = "-523449441"
	)
	static void method2677(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Ley;",
		garbageValue = "796333939"
	)
	static WorldMapLabelSize method2670(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium};
		WorldMapLabelSize[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			WorldMapLabelSize var4 = var2[var3];
			if (var0 == var4.field1567) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-7"
	)
	public static void method2676() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-888739808"
	)
	public static void method2678() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		signature = "(Lnu;IB)V",
		garbageValue = "-107"
	)
	static void method2679(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class305.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var4) {
			}
		}

	}
}
