import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lek;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1856527829
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -334819521
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1578997885
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1711364077
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("r")
	@Export("name")
	public String name;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1034605975
	)
	public int field1563;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1720690587
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("b")
	public boolean field1569;
	@ObfuscatedName("i")
	public boolean field1567;
	@ObfuscatedName("k")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("g")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("t")
	int[] field1570;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1625174781
	)
	int field1573;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 796441921
	)
	int field1566;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 110963729
	)
	int field1571;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1540991657
	)
	int field1556;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("n")
	int[] field1577;
	@ObfuscatedName("l")
	byte[] field1578;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 477871251
	)
	@Export("category")
	public int category;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1569 = true;
		this.field1567 = false;
		this.menuActions = new String[5];
		this.field1573 = Integer.MAX_VALUE;
		this.field1566 = Integer.MAX_VALUE;
		this.field1571 = Integer.MIN_VALUE;
		this.field1556 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;S)V",
		garbageValue = "28368"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "1992527916"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method6630();
		} else if (var2 == 2) {
			this.sprite2 = var1.method6630();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1563 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field1569 = false;
				}

				if ((var3 & 2) == 2) {
					this.field1567 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field1570 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field1570[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1577 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1577.length; ++var5) {
					this.field1577[var5] = var1.readInt();
				}

				this.field1578 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field1578[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method6630();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method6630();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)Clock.findEnumerated(MouseHandler.method726(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)Clock.findEnumerated(class106.method2373(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	public void method2724() {
		if (this.field1570 != null) {
			for (int var1 = 0; var1 < this.field1570.length; var1 += 2) {
				if (this.field1570[var1] < this.field1573) {
					this.field1573 = this.field1570[var1];
				} else if (this.field1570[var1] > this.field1571) {
					this.field1571 = this.field1570[var1];
				}

				if (this.field1570[var1 + 1] < this.field1566) {
					this.field1566 = this.field1570[var1 + 1];
				} else if (this.field1570[var1 + 1] > this.field1556) {
					this.field1556 = this.field1570[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZB)Loa;",
		garbageValue = "1"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Loa;",
		garbageValue = "112"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)Widget_cachedSprites.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Tile.SpriteBuffer_getSprite(class244.WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					Widget_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "78"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1243419683"
	)
	static long method2721() {
		try {
			URL var0 = new URL(class19.method283("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lmo;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1387320814"
	)
	static String method2742(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "1458799604"
	)
	public static char method2732(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a';
		case 'Ç':
		case 'ç':
			return 'c';
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e';
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i';
		case 'Ñ':
		case 'ñ':
			return 'n';
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o';
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u';
		case 'ß':
			return 'b';
		case 'ÿ':
		case 'Ÿ':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}
}
