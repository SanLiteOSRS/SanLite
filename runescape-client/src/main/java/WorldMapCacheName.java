import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	public static final WorldMapCacheName field3154;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	public static final WorldMapCacheName field3155;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	public static final WorldMapCacheName field3156;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	static final WorldMapCacheName field3157;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	public static final WorldMapCacheName field3158;
	@ObfuscatedName("ao")
	@Export("name")
	public final String name;

	static {
		field3154 = new WorldMapCacheName("details"); // L: 4
		field3155 = new WorldMapCacheName("compositemap"); // L: 5
		field3156 = new WorldMapCacheName("compositetexture"); // L: 6
		field3157 = new WorldMapCacheName("area"); // L: 7
		field3158 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	static void method5751() {
		if (Client.isSpellSelected) { // L: 10148
			Widget var0 = class243.field2620.method6286(ChatChannel.field1020, Client.field678); // L: 10149
			if (var0 != null && var0.onTargetLeave != null) { // L: 10150
				ScriptEvent var1 = new ScriptEvent(); // L: 10151
				var1.widget = var0; // L: 10152
				var1.args = var0.onTargetLeave; // L: 10153
				AbstractWorldMapData.runScriptEvent(var1); // L: 10154
			}

			Client.field688 = -1; // L: 10156
			Client.isSpellSelected = false; // L: 10157
			WorldMapData_0.invalidateWidget(var0); // L: 10158
		}
	} // L: 10159
}
