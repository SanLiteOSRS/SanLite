import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("WallObject")
public final class WallObject {
	@ObfuscatedName("an")
	static String field2768;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1225941573
	)
	@Export("z")
	int z;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -962187195
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -834568319
	)
	@Export("y")
	int y;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -453008145
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1304759669
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -7566933810645434605L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -596388311
	)
	@Export("flags")
	int flags;

	WallObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1120121316"
	)
	static final void method4846() {
		class275.method5532(WorldMapRegion.field2874, PacketWriter.field1404, WorldMapDecoration.field2970); // L: 4145
		FloorOverlayDefinition.method4027(class135.field1629, class16.field88); // L: 4146
		if (ClanSettings.cameraX == WorldMapRegion.field2874 && UserComparator10.cameraY == PacketWriter.field1404 && WorldMapDecoration.field2970 == class366.cameraZ && class135.field1629 == class103.cameraPitch && class16.field88 == class285.cameraYaw) { // L: 4147
			Client.field767 = false; // L: 4148
			Client.isCameraLocked = false; // L: 4149
			WorldMapData_0.field2806 = 0; // L: 4150
			Players.field1352 = 0; // L: 4151
			FloorOverlayDefinition.field2266 = 0; // L: 4152
			Message.field485 = 0; // L: 4153
			AttackOption.field1320 = 0; // L: 4154
			UserComparator7.field1444 = 0; // L: 4155
			ModeWhere.field4340 = 0; // L: 4156
			Occluder.field2636 = 0; // L: 4157
			class108.field1416 = 0; // L: 4158
			class10.field55 = 0; // L: 4159
		}

	} // L: 4162
}
