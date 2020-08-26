import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class182 {
	@ObfuscatedName("s")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("t")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 346475307
	)
	static int field2135;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1906338265
	)
	static int field2136;
	@ObfuscatedName("w")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("g")
	@Export("bufferY")
	static int[] bufferY;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive0")
	static Archive archive0;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;I)V",
		garbageValue = "-1480646346"
	)
	static void method3683(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance);
		var0.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field418 = -1;
	}
}
