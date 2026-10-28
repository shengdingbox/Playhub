import sys

sys.path.insert(0, '.')
import deflat

CASE_A = '''    private boolean B(String str2) {
        int i2 = 1616;
        try {
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    break;
                    case 49:
                        if (str2 == null) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        boolean z = (str2.isEmpty());
                        if (!(z)) {
                            return true;
                        }
                        break;
                    case 239:
                        return false;
                }
                i2 = 1678;
            }
        } catch (Exception e) {
        }
    }
'''

CASE_B = '''    private void C() {
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                break;
                case 49:

                break;

                case 204:
                return;
                case 239:
                return;
            }
            i = 1678;
        }
    }
'''

CASE_C = '''    private String D() {
        while (true) {
            i ^= 1881;
            switch (i) {
                case 17:
                i = 48674;
                break;
                case 47483:
                return "";
            }
        }
    }
'''

CASE_D = '''    private void E(String str6) {
        int i = 1864;
        while (true) {
            i ^= 1881;
            switch (i) {
                case 17:
                if (str6 == null) {
                    break;
                } else {
                    i = 48736;
                    continue;
                    continue;
                }
                case 47384:
                break;
                case 47417:
                boolean z2 = (str6.isEmpty());
                if (z2) {
                    return;
                }
                break;
            }
            i = 1678;
        }
    }
'''

for name, src in [('A 跨块头找 seed', CASE_A), ('B 无 seed 全 return', CASE_B),
                  ('C 无 seed 状态赋值', CASE_C), ('D 重复 continue', CASE_D)]:
    out, stats = deflat.deflate_file(src)
    print('===== %s  stats=%s' % (name, stats))
    print(out)
